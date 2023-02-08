package week8_07_12_2022;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        countSpacesInSentence(" this is java office hour");
        System.out.println("countSpaceInSentence = " + countSpaceInSentence(" this is java office hour"));
        calculateTotalMoney(20_000.00, 0.12, 5);
        System.out.println(isLeapYear(2000));
    }

    //write a java method, count all the space in given string, then print the number of space
    //" this is java office hour" -- > 5

    // write a java method to calculate total money in your bank account
    // mehtod receives 3 arguents: original amount, rate, year.

    public static void calculateTotalMoney(double originalAmount, double rate, int year) {
        for (int i = 0; i < year; i++) {

            originalAmount = originalAmount + originalAmount * rate;
            System.out.println(originalAmount);

        }

        System.out.println("Total bank account = " + originalAmount);

    }

    public static void countSpacesInSentence(String sentence) {

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(sentence + " --> " + count);
    }

    public static int countSpaceInSentence(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

// write a java method check given year is leap year or not return boolean

    public static boolean isLeapYear(int year) {

        boolean leapYear;

        if (year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        return leapYear;
    }


}
