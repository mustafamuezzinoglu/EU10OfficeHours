package week9_21_12_2022;

import java.util.Scanner;

public class WrapperClassMethods {

    public static void main(String[] args) {

        System.out.println("numberBelowZero() = " + numberBelowZero());
        divisible3();
        //autoboxing
        int a = 10;
        Integer b = a;

        //unboxing
        Integer c = 50;
        int d = c;

        /*
        1. parsInt() : parse a string and returns its integer value
        2. valueOf() : convert a string to an integer object
        3. toString() : take a int/Integer's string value and return it as a string object
        4. Integer.Max or Min: take maximum Integer value or minimum Integer value
         */

        System.out.println("Integer.toString(123).concat " + Integer.toString(123).concat("OneTwoThree")); //123OneTwoThree

        String str = "123house258";
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                total += Integer.valueOf("" + str.charAt(i));

            }
        }
        System.out.println("total" + total);
    }

    public static boolean numberBelowZero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        String num = scanner.nextLine();
        if (Integer.parseInt(num) >= 0) {
            return true;
        }
        return false;
    }

    public static void divisible3() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter something with number and letters: ");
        String num = "456number87459963";
        int digits = 0;
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) {
                if (Integer.valueOf(num.charAt(i)) % 3 == 0) {
                    digits += Integer.valueOf("" + num.charAt(i));
                }
            }
        }
        System.out.println("digits = " + digits);
    }
}

