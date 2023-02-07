package week3_02_11_2022;

public class PrecedencePractice {

    public static void main(String[] args) {

        int a = 7 * 3 + 24 / 3 - 5;
        //      21   +   8   - 5 = 24
        int b = (7 * 3) + (24 / 3) - 5;
        //        21   +     8     - 5 = 24
        System.out.println(a + ", " + b);




        int x = 20;
        int y = 10;
        double z = x++ - y * 7 / y-- + x * 10;
        //         20  -  70/10    +   210
        //         13     +   210   = 223
        System.out.println("z = " + z);

        long e= 3_000L;
        double f=(float)e;
        int d=(int)f;
        System.out.println(d%1000);


    }
}