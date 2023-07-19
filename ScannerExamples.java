import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите случайное целое число: ");
        int a = sc.nextInt();
        System.out.println("Введено число " + a);

        System.out.print("Хорошая ли погода в данный момент? ");
        boolean b = sc.nextBoolean();
        System.out.println("Введено значение " + b);

        System.out.println("Введите случайное число с плавающей точкой: ");
        double c = sc.nextDouble();
        System.out.println("Данное введенное число было умножено на 10 " + (c * 10));

        sc.close();
    }
}
