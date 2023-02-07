package week3_02_11_2022;

public class ShortHandPractice {

    public static void main(String[] args) {

        int a = 5;
        a = 5 + 1;
        a = a + 1;
        a += 1;  // a = a + 1;
        a -= 1;  // a = a -1;
        a *= 1; // a = a*1;
        a /= 1; // a = a/1;

        int b = 10;
        b -= 1;
        System.out.println("b = " + b); // 9

        int c = 20;
        c *= 1;
        c *= 2;
        System.out.println("c = " + c);  //20  // 40


        int d = 50;
        d /= 5;
        System.out.println("d = " + d); //10

        int e = 100;
        e %= 3;
        System.out.println("e = " + e); //1

    }
}