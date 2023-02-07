package week3_02_11_2022;

public class UnaryOperators {

    public static void main(String[] args) {


        int a = 5;
        int b = +5;

        int c = -5;

        int d = 5;
//        d = 5+1;
        ++d;
        System.out.println(d);
        System.out.println("--d = " + --d);
        --d;
        System.out.println("d = " + d);


        // post increment/decrement

        int f = 100;
        f++;  //now this line f still same
        System.out.println(f); //101

        int g = 200;
        System.out.println(g++ + g); //
                        // 200  201   401


        int h = 300;
        System.out.println(h + h++); //600
        System.out.println(h + h++); //602


        int i = 10;
        System.out.println(i + i-- + i--); //29

        int num1=11, num2=22, num3=0;
        num3 = num1 + num2 + num1++ + num2++ + ++num1 + ++num2;
            // 11   +  22  + 11   +  22     +   13   +  24
        System.out.println("num1 = " + num1); //13
        System.out.println("num2 = " + num2); //24
        System.out.println("num3 = " + num3); // 103


        int num4=0;
        num4 = num4++ - --num4 + ++num4 - num4--;
        //      0     -  0     +  1    -  1
        System.out.println("num4 = " + num4);  // 0

    }
}