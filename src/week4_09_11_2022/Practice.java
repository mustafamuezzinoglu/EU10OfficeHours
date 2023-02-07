package week4_09_11_2022;

public class Practice {

    public static void main(String[] args) {


        // 1. assign two variable with different numbers, using if statement, print the bigger one with proper message

        int a = 10;
        int b = 20;

        if( a > b){
            System.out.println( a + " is bigger than " + b);
        }else{
            System.out.println( a + " is smaller than " + b);
        }


        // 2. A shop will give discount of 10% if the total amount is more than 1000.
        // using if statement, print if you can get discount
  int discount =10, totalAmount1 = 1000;

        if (totalAmount1 >= 1000){
            System.out.println("you can get discount");
        totalAmount1= totalAmount1-(totalAmount1*10/100);
        }else {
            System.out.println("you can't get discount");
        }

        System.out.println("totalAmount1 = " + totalAmount1);






        int totalAmount = 900;

        if (totalAmount >= 1000){
            System.out.println("you can get discount");
        }else {
            System.out.println("you can't get discount");
        }

        System.out.println("totalAmount = " + totalAmount);

        // 3. check kids age, decide which school they should go to
    /*
    0-2 at home
    3-6 kindergarten
    7-12 primary school
    */

        int age = 6;
        if (age > 0 && age <=2){
            System.out.println("the kid should be at home");
        } else if (age >=3 && age <=6) {
            System.out.println("the kid should go to kindergarten");
        }else if(age >=7 && age <=12){
            System.out.println("the kid should go to primary school");
        }else {
            System.out.println("please enter a proper number");
        }


    }
}