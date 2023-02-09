package week11_04_01_2023.staticPractice;

import java.util.Arrays;

public class StaticPractice {

    public static int a = 10;
    public int b = 20;


    public void method1(){
        System.out.println("this is not static method ");
        System.out.println(b);
        System.out.println(a);
    }

    public static void method2(){
        System.out.println("this is static method");
        String[] names = new String[5];

    }


}