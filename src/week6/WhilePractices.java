package week6;

import java.util.Scanner;

public class WhilePractices {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();

    }


    private static void six() {
        String password = "Cydeo123!";
        Scanner scan = new Scanner(System.in);
        int guessNo = 0;
        while (true) {
            System.out.println("enter a password");
            String yourPassword = scan.next();
            if (yourPassword.equals(password)) {
                System.out.println("Welcome to dashboard");
                break;
            }
            guessNo++;
            if (guessNo == 2) {
                System.out.println("this is your last try");
            }
            if (guessNo == 3) {
                System.out.println("Your account is deactivated");
                break;
            }
        }
    }

    private static void five() {
//print only vovels in given word
//        a,e,i,o,u    home --> o,e
        String word = "home";
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'o' || ch == 'e') {
                res += ch;
            }
        }
        System.out.println(res);


    }


    public static void one() {
        int count = 1;
        while (count <= 10) {
            count *= 2;
        }
        count = count - 10;
        System.out.println("count = " + count);

    }

    public static void two() {
        int count = 100;
        while (count < 100) {
            count = count + 1;
        }
        System.out.println("count = " + count);

    }

    public static void three() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print(" " + i);
            i++;
        } while (i < 11);

    }

    public static void four() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }


}







