package week4_09_11_2022;

import java.util.*;

public class ScannerPractice {

    public static void main(String[] args) {

         /*
    use scanner and switch together, let user enter browser names
    then print msg that browser is setting up
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you browser name:");
        String browserType = scanner.nextLine();

        switch (browserType){
            case "firefox":
                System.out.println("firefox is being set up");
                break;
            case "chrome":
                System.out.println("chrome is being set up");
                break;
            case "edge":
                System.out.println("edge is being set up");
                break;
            default:
                System.out.println("please enter a valid browser name");
        }

    }
}