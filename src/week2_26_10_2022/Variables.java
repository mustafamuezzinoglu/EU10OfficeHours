package week2_26_10_2022;

public class Variables {
    public static void main(String[] args) {

        byte number = 12;
        byte number1=-32;

//        byte wrongNumber = 65220; //byte must be -128 to 127

        short number2= 32000;
        short number3= 5;           //short must be -32768 to 32767

        int number4= 15201458;      //int must be -32768 to 32767

        long number5= 1520000000000L; // LONG must be -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float number6= 3.1F;
        long number7= 100;          //compiler bunu int olarak görür çünkü int range aralığında  hata vermez

        long number8 =2147483648L;

        double number9 =3.2568;

        char letter1='q';     // not double quote
        char letter2= 'A';

char letter3=93; // ascitable a göre bu ] karakteridir
int number10=93; // değeri 93 tür o nedenle aynı değildir

        System.out.println(letter3);
        System.out.println(number10);

        boolean     man = true;
        boolean married = false;

        double tax =0.15;
        double JohnSalary= 10000;

        double salaryAfterTax=JohnSalary-(JohnSalary*tax);
        System.out.println(salaryAfterTax);

        int numberOfEmployee=10;




    }
}
