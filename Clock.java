package Home_Work;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {


        Random random = new Random();

        // генерируем случайное количество секунд
        int n = random.nextInt(28800);

        System.out.println("Осталось " + n + " секунд");

        int q = n / 3600;

        System.out.println("Осталось " + q + " полных часа");

        if (q > 1) {
        } else if (q == 1) {
        } else {
            System.out.println("Осталось менее часа");
        }

    }
}
