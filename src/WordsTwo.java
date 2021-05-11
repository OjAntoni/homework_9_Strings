import java.util.Scanner;

/**
 * Класс, в котором метод main принимает
 * строку произвольной длины с произвольными словами.
 * Находит слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры. Если таких слов несколько, находит первое из них.
 */
public class WordsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.replaceAll("  ", " ").split(" ");
        int[] diffSym = new int[words.length];
        char[] currWorld;

        for(int i = 0; i < words.length; i++){
            currWorld = words[i].toCharArray();
            diffSym[i] = countDiffSym(currWorld);
        }

        int min = diffSym[0];
        int j = 0;
        for(int i = 0; i < diffSym.length; i++){
            if(diffSym[i]<min) {
                min = diffSym[i];
                j = i;
            }
        }

        System.out.println(words[j]);
    }

    /**
     * метод предназначен для подсчета уникальных(неповторяющихся) символов в массиве char
     * @param array массив типа char, по которому проходит метод и считает, сколько в массиве уникальных символов
     * @return возвращает число уникальныз символов в array
     */
    private static int countDiffSym(char[] array){
        if(array.length==1) return 1;
        char sym = array[1];
        int count = 1;
        boolean unique = true;
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if (array[j] == sym) {
                    unique = false;
                    break;
                }
            }
            sym = array[i];
            if(unique) count++;
        }
        return count;
    }
}
