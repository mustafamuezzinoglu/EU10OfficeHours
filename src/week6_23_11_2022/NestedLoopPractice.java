package week6_23_11_2022;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
//        one();
//        oneToTen();
//        sum();
        oneToFive();
    }

    private static void oneToFive() {
        for (int z =1; z<= 5; z++) {
            for (int j = 1; j<=z; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
    }

/*
    private static void one() {
        for (int i = 1; i < 2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + j);
            }
        }
    }


    private static void oneToTen() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }

    // input a number, use 3 number smaller or equal to that number,
    // make combination that sum of that 3 number is equal to the number you input.
    // 2 --> 6

002
011
020
101
110
200

    // 3 --> 10
    // 5 --> 21

    private static void sum() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();

        int sum = 0;
        for (int a = 0; a <= number; a++) {
            for (int b = 0; b <= number; b++) {
                for (int c = 0; c <= number; c++) {
                    if (a + b + c == number) {
                        System.out.println("" + a + b + c);
                        sum++;
                    }
                }
            }
        }
        System.out.println("sum = " + sum);
    }
*/
}