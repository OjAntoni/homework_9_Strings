import java.util.Scanner;

/**
 * Класс в методе main принимает на вход строку со словами
 * Ищет самое короткое и длинные слова в строке
 * Если таких несколько, то запоминает последние.
 */
public class WordsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.replaceAll("  "," ").split(" ");
        int minlen;
        int maxlen;
        int minlenIndex = 0;
        int maxlenIndex = 0;

        minlen =words[0].length();
        maxlen =words[0].length();
        for(int i = 1; i < words.length; i++){
            if(words[i].length() <= minlen) {
                minlenIndex = i;
                minlen = words[i].length();
            }
            else if (words[i].length() >= maxlen){
                maxlenIndex = i;
                maxlen = words[i].length();
            }
        }

        System.out.println(words[minlenIndex] + "\t" + words[maxlenIndex]);
    }
}
