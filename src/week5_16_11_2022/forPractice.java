package week5_16_11_2022;

import java.util.Scanner;

public class forPractice {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
        practice5();
        practice6();
    }

    public static void practice1() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);

        }
        System.out.println("-----------------");
    }

    public static void practice2() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("-----------------");
    }

    public static void practice3() {
      //  Scanner scan = new Scanner(System.in);
      //  int num = scan.nextInt();
        int num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }

    }

    public static void practice4() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));

        }
    }


    public static void practice5() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9 - i * 2 + 1) + String.valueOf(i+1).repeat(i*2+1));
        }
    }
    //reverse a string
    //home  -- >emoh
    public static void practice6(){
        String word= "afatsuM";
        String res="";
        for (int i =word.length()-1; i >=0 ; i--) {
            res+= word.charAt(i);
        }
        System.out.println(res);
    }






}
