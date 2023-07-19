import java.util.Scanner;

public class ScannerExamples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = sc.next();
        System.out.println("Вы ввели слово: " + word);

        sc.nextLine();

        System.out.print("Введите строку: ");
        String line = sc.nextLine();
        System.out.println("Вы ввели строку: " + line);

        System.out.println("Символ из строки: " + line.charAt(0));

        sc.close();
    }
}
