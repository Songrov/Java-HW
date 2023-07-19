package Home_Work;

public class Coffe_Automat {
    public static void main(String[] args) {


        int button = 4; // например, пользователь нажал кнопку "капучино"

        if (button == 1) {
            System.out.println("Приготовление эспрессо...");
        } else if (button == 2) {
            System.out.println("Приготовление американо...");
        } else if (button == 3) {
            System.out.println("Приготовление капучино...");
        } else if (button == 4) {
            System.out.println("Заваривание чая...");
        } else {
            System.out.println("Выберите корректную кнопку");
        }

    }
}
