import java.util.Scanner;

/**
 * Класс в методе main принимает
 * строку произвольной длины с произвольными словами.
 * Также принимает индекс слова для последующей проверки.
 * Проверяет является ли любое выбранное слово в строке полиндромом.
 */
public class Polyndroms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = sc.nextLine();
        System.out.println("Введите индекс слова для проверки: ");
        int index = sc.nextInt();
        String[] words = line.split(" ");
        StringBuilder str = new StringBuilder(words[index]);

        if(str.reverse().toString().equals(words[index])){
            System.out.println("Слово " + words[index] + " - полиндром");
        }
        else{
            System.out.println("Слово " + words[index] + " не полиндром");
        }
    }
}
