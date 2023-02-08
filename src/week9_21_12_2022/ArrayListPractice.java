package week9_21_12_2022;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();

    }

    public static void one() {
// Write a Java program that creates an ArrayList of strings and then adds five strings to the list. Then remove the first and last elements of the list, and then print the remaining elements to the console.

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("abi", "bursa", "ceyhan", "sen", "ben"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list);
    }

    public static void two() {
//Write a Java program that creates an ArrayList of 10 integers, and then removes the elements at index positions 2, 4, and 6 from the list. The program should then print the resulting list to the console.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }
        System.out.println(nums);

        nums.remove(1);
        nums.remove(2);
        nums.remove(3);
        System.out.println(nums);
    }

    public static void four() {
//Write a Java program that creates an ArrayList of 10 random integers between 1 and 100, and then sorts the list in descending order.
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);


    }

    public static void five() {
//Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program should then reverse the order of the elements in the list and print the resulting list to the console.
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Almanya  ", "Istanbul", "ceyhan", "Alice", "Bob"));

        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);
    }

    private static void six() {
//Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list. The program should then find the smallest and largest elements in the list and print them to the console.
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("list = " + list);
        System.out.println("Collections.min(list) = " + Collections.min(list));
        System.out.println("Collections.max(list) = " + Collections.max(list));


    }


    public static void three() {
//Write a java program that create an arraylist has random numbers, then check those number, if they are even, add again to the arraylist
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(100));
        }
        System.out.println("nums = " + nums);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : nums) {
            if (each % 2 == 0) {
                result.add(each);
            }
        }
        nums.addAll(result);
        System.out.println("nums even= " + nums);

    }


}
