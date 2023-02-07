package week5_16_11_2022;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "hat";
        String s2 = new String("hat");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "hat";
        System.out.println(s1 == s3); //true

        System.out.println("firsts3 = "+s3);//hat
        s3 = "bag";
        System.out.println("seconds3 = " + s3); //bag

        checkLength();
        trimMethod();
        indexMethod();
        substringMethod();
        isEmptyBlank();
        equalsMethod();
        containsMethod();
        startsOrEnds();
        initals();
    }
    public static void checkLength(){ // returns    the length of the   string
        System.out.println( "house".length());
        System.out.println( "How much characters of this statement".length());

    }
    public static void trimMethod(){ // deletes the first and last empty characters of a string
        System.out.println("  this is a .trim method, practice  .  ".trim());
        System.out.println("  this is a .trim method, practice  .  ".replace(" ",""));
    }
    public static void indexMethod(){ // returns the index of the first occurrence of a character in a string
        String data= "Hello, World";
        System.out.println(data.indexOf('o')); // returns the index of the first occurrence of ==>4
        System.out.println(data.lastIndexOf("o")); // returns the index of the last occurrence of ==>8
    }
    public static void substringMethod(){ //returns a substring of a string
        String data = "This is substring practice";
        String subData1 = data.substring(5); // it strarts from index 5
        String subData2 = data.substring(5,10); // it starts fromindex 5 to 10 not including ending index
        System.out.println("subdata1 "+ subData1);
        System.out.println("subdata2 "+subData2);
        System.out.println(data.repeat(3)); // repeat the string 3 times
    }
    public static void isEmptyBlank(){
        String data = "";
        String data1 = " ";
        System.out.println("data is empty "+ data.isEmpty()); // returns true because in double quote there is nothing
        System.out.println("data1 is empty "+ data1.isEmpty()); // returns false because in double quote there is empty
        System.out.println("data is blank "+ data1.isBlank()); // returns true because blank means no data
        System.out.println("data1 is blank "+ data.isBlank()); // returns true because blank means no data

    }

    public static void equalsMethod() {
        String DATA = "PRACTICE";
        String data = "practice";
        System.out.println(DATA.equals(data)); //return false because one of them upper the other lowercase
        System.out.println(DATA.equalsIgnoreCase(data)); //return true because method is case sensitive
    }

    public static void containsMethod(){
        System.out.println("Umbrella".contains("e"));
        System.out.println("Umbrella".contains("Umb"));
        System.out.println("Umbrella".contains("umb"));
    }
    public static void startsOrEnds(){
        String data ="abcdefsgh";
        System.out.println(data.startsWith("abc")); // returns true
        System.out.println(data.startsWith("A")); //return false
        System.out.println(data.endsWith("h")); // returns true
        System.out.println(data.endsWith("H")); //return false
    }
    public static void initals(){
        String name1= "Washington Elbert Always";//R.D.Junior
        System.out.println("name1 = " +name1);
        String name2 =name1.replaceAll(" ",".");

        System.out.println("name2 = " + name2);
        String name3=name2.substring(0,1)
                +name2.substring(name2.indexOf("."),name2.indexOf(".")+2)
                +name2.substring(name2.lastIndexOf("."));
        System.out.println("name3 = " + name3);


        name1 = name1.replace("Robert ","R.");
        name1 =name1.replace("Down ","D.");
        System.out.println(name1);
    }
}
