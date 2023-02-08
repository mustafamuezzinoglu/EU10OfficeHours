package week7_30_11_2022;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //The N dimensional array is a container for (N-1) dimensional arrays
        // 2 d array has multiple 1d arrays
        // 3d arrays has multiple 2d arrays

        int[] arr1 = new int[5];
        int[] [] arr2d = new int[2][];
        int[] [] [] arr3d = new int[3][][];

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2d = " + Arrays.deepToString(arr2d));
        System.out.println("arr3d = " + Arrays.deepToString(arr3d));

        arr1[0]= 1;
        arr1[1]= 1;
        arr1[2]= 1;
        arr1[3]= 1;
        arr1[4]= 1;

        arr2d[0] =new int[]{1,2,3};
        int[] element1= {4,5,6,7,8,9};
        arr2d[1]=element1;

 // arr3d[0] = new int[]{1,2,3};
//        arr3d[1]=new int[]{4,5,6};

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2d = " + Arrays.deepToString(arr2d));
        System.out.println("arr3d = " + Arrays.deepToString(arr3d));

        System.out.println("arr2d[1] = " +Arrays.toString(arr2d[1]));
        System.out.println("arr2d[1][3] = " + arr2d[1][3]);


    }
}
