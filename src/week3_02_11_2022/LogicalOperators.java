package week3_02_11_2022;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println(true); // true
        System.out.println( true && true);  // true
        System.out.println( true && false);  // false
        System.out.println( false && true);  // false
        System.out.println( false && false); // false

        System.out.println(true || true); //true
        System.out.println(false || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        System.out.println(!true); // false
        System.out.println(!false); // true

        //practice

        int a = 1, b = 2;
        System.out.println((a++ - --b) > (++a - b++)); // false
        //                  (0)       >    2


        boolean d, e, f;
        d = e = f = true;
        System.out.println( !d || ( d && f ) ); // true
        //                  f         t

    }
}