package week11_04_01_2023.accessModifiers;

public class AccessModifierObjects {
    public static void main(String[] args) {
        Math.max(1, 2);
//        Math math = new Math(); it gives error because Math class accessible but its constructor is private so u can't create object
    }

    String s = "Hello World";

    public void two() {

        AccessModifiers am = new AccessModifiers();
        System.out.println(am.a);
        System.out.println(am.b);
        System.out.println(am.c);
//        System.out.println(am.d ); it gives an error because d is not accessible it has private access modifier

        am.one();
        am.three();
        am.four();
//        am.five(); it gives an error because method five is not accessible it has private access modifiers


    }
}
