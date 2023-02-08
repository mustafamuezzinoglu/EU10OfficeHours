package week7_30_11_2022;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int number : numbers) {
            System.out.println("number = " + number);

        }

        // create email list as @gmail for given names
//    {"Harold","Jack","Ahmet","Sakushi"};
        String mail = "@gmail.com";
        String[] names = {"Harold", "Jack", "Ahmet", "Sakushi"};
        String[] list = new String[names.length];
        for (String name : names) {
            name = name.toLowerCase() + mail;
            System.out.println(name);
        }
    String[] names1 = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
int total = 0;
        // use Integer.valueOf(String)  to convert String to int
        for (String name : names1) {
        total+= Integer.valueOf(name.substring(name.length()-4));

        }
        System.out.println(total);


    }


}
