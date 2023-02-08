package week8_07_12_2022;

public class CustomMethods {

    public static void main(String[] args) {

        webAppTesting("Ahmet");
        webAppTesting("Ahmet", "Google");
        webAppTesting("Ahmet", "Google", 2);
        manuelTesting();
        apiTesting();
        dataBaseTesting();
        System.out.println(returnDataBaseTesting());
    }

    public static void webAppTesting(String name) {
        System.out.println(name + ", please test this manuel test");
    }

    public static void webAppTesting(String name, String projectName) {
        System.out.println(name + ", please test this " + projectName + " manuel test");
    }

    public static void webAppTesting(String name, String projectName, int time) {
        System.out.println(name + ", please test this " + projectName + " manuel test in " + time + " hours");
    }


    public static void manuelTesting() {
        System.out.println("This is for manuel testing");
    }

    public static void apiTesting() {
        System.out.println("This is for api testing");
        String s = returnDataBaseTesting();
    }

    public static void dataBaseTesting() {
        System.out.println("This is for data base testing");
    }

    public static String returnDataBaseTesting() {
        System.out.println("This is for return data base testing in method");
        return "This is for return data base testing";
    }

    // we have two types of custom methods according to what they do
    //void type --> which is not returning anything, only do a certain action
    //data type method --> which is returning a data
}
