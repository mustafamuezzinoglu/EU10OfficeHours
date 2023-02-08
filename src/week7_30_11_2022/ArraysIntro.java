package week7_30_11_2022;

import java.util.*;

public class ArraysIntro {

    public static void main(String[] args) {
        //Array can hold multiple values
        // but variable can hold only one

        int[] nums;
        int number[];

        String[] names;
        String lastNames[];

        boolean[] isSunny = new boolean[1];
        isSunny[0]=true;//to add element to an array you should use this [] and write in it index number
        boolean[] isSunnyAnkara = {true, false, true, false, true, false, true};

        System.out.println(Arrays.toString(isSunny));
        System.out.println(Arrays.toString(isSunnyAnkara));

        int numbers[] = new int[5];
        System.out.println(Arrays.toString(numbers));

        String gender[] = new String[6];
        System.out.println(Arrays.toString(gender));

//        int double boolean
//        String, Arrays

        numbers[0] = 5;
        numbers[1] = 50;
        numbers[2] = 500;
        numbers[3] = 5000;
        numbers[4] = 50000;
//        numbers[5] = 500000; it gives error  Index 5 out of bounds for length 5 ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(numbers));


        isSunnyAnkara[0] = false;
        System.out.println(Arrays.toString(isSunnyAnkara));


    }


}