package week13_18_11_2023;

public class ExceptionsPractice {

    public static void main(String[] args) {

//        method1();
//        method2();
//        method3();
    }

    private static void method3() throws InterruptedException {

        Thread.sleep(100);
        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void method1() {
        try {
            System.out.println(10/0);
            String str =null;
            System.out.println(str.toLowerCase());
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (NullPointerException e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("this is finally block");
        }
    }

    public static void method2()  {


       try{
           Thread.sleep(1000);
           String str =null;
        System.out.println(str.toLowerCase());
    }catch (NullPointerException e){
           System.out.println(e.getMessage());
           System.out.println(e.toString());
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }



}
