package week7_30_11_2022;

import java.util.Arrays;

public class MultiDArraysPractice {

    private static void two() {
        //int [][] table = {{1,2,3},{4,5,6},{7,8,9}};
        //get sum of these numbers

        int [][] table = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        // create a 2d array of fruits, has fruits, price, count
        // print --> apple price is 10 dollar, 100 left.
        one();
        two();

    }

    private static void one() {

        String[][] fruits = new String[3][];

        String[] fruit = {"apple", "banana", "kiwi"};
        String[] price = {"10", "12", "4"};
        String[] count = {"100", "200", "300"};

        fruits[0] = fruit;
        fruits[1] = price;
        fruits[2] = count;
        System.out.println(Arrays.deepToString(fruits));

        for (int i = 0; i < fruits.length; i++) {
            String name = fruits[0][i];
            String price1 = fruits[1][i];
            String count1 = fruits[2][i];

            System.out.println(name + " price is " + price1 + " dollar, " + count1 + " left.");

        }





    }
}
