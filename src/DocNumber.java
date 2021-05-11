import java.util.Scanner;

/**
 * Класс работает с документом нужного формата
 */
public class DocNumber {
    public static void main(String[] args) {
        System.out.println("x - число, у - буква");
        System.out.println("xxxx-yyy-xxxx-yyy-xyxy");
        Scanner sc = new Scanner(System.in);
        String docNum = sc.nextLine();

        System.out.println("----------------------");
        System.out.println(getDigitBlocks(docNum));
        System.out.println("----------------------");
        System.out.println(fillWithStars(docNum));
        System.out.println("----------------------");
        System.out.println(onlyLetters(docNum));
        System.out.println("----------------------");
        System.out.println(onlyLettersExtend(docNum));
        System.out.println("----------------------");
        startsWith555(docNum);
        System.out.println("----------------------");
        endsWith1a2b(docNum);



    }

    public static String onlyLetters(String doc){
        return getString(doc);
    }

    public static String onlyLettersExtend(String doc){
        return "Letters: " + getString(doc).toString().toUpperCase();
    }

    private static String getString(String doc) {
        StringBuilder docLetters = new StringBuilder();
        char[] array2 = doc.toLowerCase().toCharArray();
        docLetters.append(array2[5]);
        docLetters.append(array2[6]);
        docLetters.append(array2[7]);
        docLetters.append("/");
        docLetters.append(array2[14]);
        docLetters.append(array2[15]);
        docLetters.append(array2[16]);
        docLetters.append("/");
        docLetters.append(array2[19]);
        docLetters.append("/");
        docLetters.append(array2[21]);
        return docLetters.toString();
    }

    public static void serachForAbc(String doc){
        if(doc.contains("abc") || doc.contains("ABC"))
            System.out.println("содержит");
        else
            System.out.println("не содержит");
    }

    public static String getDigitBlocks(String doc){
        String[] array =doc.split("-");
        return array[0]+array[2];
    }

    public static String fillWithStars(String doc){
        String[] array =doc.split("-");
        array[1]="***";
        array[3]="***";
        StringBuilder docNum2 = new StringBuilder();
        for(String s : array) docNum2.append(s).append("-");
        return docNum2.toString();
    }

    public static void startsWith555(String s){
        if(s.startsWith("555"))
            System.out.println("Начинается с 555");
        else
            System.out.println("Не начинается с 555");
    }

    public static void endsWith1a2b(String s){
        if(s.endsWith("1a2b"))
            System.out.println("Заканчивается на 1a2b");
        else
            System.out.println("Не заканчивается на 1a2b");
    }
}
