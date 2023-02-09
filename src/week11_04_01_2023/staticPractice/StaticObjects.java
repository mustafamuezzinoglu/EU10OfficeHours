package week11_04_01_2023.staticPractice;

public class StaticObjects {

    static StaticPractice sp = new StaticPractice();
    static StaticPractice sp1 = new StaticPractice();
    static StaticPractice sp2 = new StaticPractice();
    StaticPractice sp3 = new StaticPractice();


    public static void main(String[] args) {
        System.out.println(sp.a);
        System.out.println(sp.b);
//        System.out.println(s3.a); it gives an error because the object is not static
        System.out.println(StaticPractice.a);

//        StaticPractice.method1(); it gives an error because the method1 is not static
        System.out.println("-----------------------");
        StaticPractice.method2();
        System.out.println("-----------------------");
        sp.method1();
        System.out.println("-----------------------");
        sp.method2();
    }
}