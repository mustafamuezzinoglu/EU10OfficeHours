package week7_30_11_2022;

import java.util.*;

public class ArraysPractice {

    public static void main(String[] args) {
       one();
        two();
    }
    //WAP to input 10 numbers in array and find sum of odd and even numbers separately.
        public static void one(){
        int[] numbers = new int[10]; //{1,2,3,4}
        int odd = 0;
        int even = 0;
        int total=0;
        for (int i = 0; i <=9 ; i++) {
            numbers[i] = i;
//            total += i;

        }
//        System.out.println(total);
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

    //WAP to input 10 numbers in array and reverse the array .
    public static void two(){
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));



        for (int i = 9; i >=0 ; i--) {
            numbers[9-i] = i;
        }

        System.out.println(Arrays.toString(numbers));

    }


}