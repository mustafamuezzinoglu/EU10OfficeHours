package week4_09_11_2022;

public class SwitchStatement {

    public static void main(String[] args) {

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("action1 ");
                break;
            case 2:
                System.out.println("action 2");
                break;
            default:
                System.out.println("default action");
        }
 /*
        use switch, provide different phone brands
        according to them, print message that buy that brand
        example of string
         */
        String brand = "Apple";
        switch (brand) {
            case "Apple":
                System.out.println("buy apple");
                break;
            case "Samsung":
                System.out.println("buy samsung");
                break;
            case "Motorola":
                System.out.println("buy motorola");
                break;
            default:
                System.out.println("default action");
        }

        int orderNumber = 200;
        switch ( orderNumber) {
            case 100:
            case 200:
                System.out.println("order "+orderNumber+" is ready");
                break;
            default:
                System.out.println("default action");
        }




    }
}
