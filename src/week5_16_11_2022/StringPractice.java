package week5_16_11_2022;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "hat";
        String s2 = new String("hat");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        checkLength();
        trimMethod();
        indexMethod();
        startsOrEnds();
        initals();
    }
    public static void checkLength(){
        System.out.println( "house".length());

    }
    public static void trimMethod(){
        System.out.println("  this is a .trim method, practice  .  ".trim());
        System.out.println("  this is a .trim method, practice  .  ".replace(" ",""));
    }
    public static void indexMethod(){
        String data= "Hello, World";
        System.out.println(data.indexOf('o'));
        System.out.println(data.lastIndexOf("o"));
    }
    public static void startsOrEnds(){
        String data ="abcdefsgh";
        System.out.println(data.startsWith("abc"));
        System.out.println(data.startsWith("A"));
        System.out.println(data.endsWith("h"));
        System.out.println(data.endsWith("H"));
    }
    public static void initals(){
        String name1= "Robert Down Junior";//R.D.Junior
        System.out.println(name1);
        name1 = name1.replace("Robert ","R.");
        name1 =name1.replace("Down ","D.");
        System.out.println(name1);
    }
}
