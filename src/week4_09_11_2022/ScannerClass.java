package week4_09_11_2022;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        String name = "Mike";
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        String nameUser = input.nextLine();

        System.out.println("Please enter your second name");
        String secondNameUser = input.nextLine();

        System.out.println("Please enter your age");
        int ageUser = input.nextInt();

        System.out.println("Your name is " + nameUser.substring(0,1).toUpperCase()+nameUser.substring(1,nameUser.length())+ " " +secondNameUser.toUpperCase() +" and your age is " + ageUser);



    }
}
