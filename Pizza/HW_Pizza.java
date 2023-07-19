package Home_Work;

public class HW_Pizza {
    public static void main(String[] args) {
        // (S = pi * r^2) * 40
        // S = d : 4 × π
        //S1 = π * r^2, где r = 12 см


        double d1 = 24;
        double d2 = 28;

        Pizza_Callory Pizza_Callory = new Pizza_Callory(d1, d2);

        System.out.println("Test = " + (d1*d1 ) / 4 * Math.PI);



    }

}
