package Home_Work;

public class Pizza_Callory {

    public Pizza_Callory(double d1, double d2) {

        div(d1);
        div1(d2);
        pow();
        pow1();
        gen1();
        gen();
        min();
        printResult();
        printResult1();
    }

    private double result1, result2, result3, result4, result5, result6, result7;

    private void div(double d1) { result1 = d1 * d1;
    }

    private void pow() {result2 = result1 / 4;
    }

    private void gen() {result3 = Math.PI * result2;
    }


    private void printResult() {
        System.out.println("Result = " + result3);
    }




    private void div1(double d2) { result4 = d2 / 2;
    }

    private void pow1() {result5 = result4 * result4;
    }

    private void gen1() {result6 = Math.PI * result5;
    }

    private void min() {
        result7 =(result6 - result3) * 40;
    }

    private void printResult1() {
        System.out.println("Result = " + result6);
        System.out.println("Kall = " + result7);
    }


}
