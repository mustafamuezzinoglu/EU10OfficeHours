package week6;

public class Nestedlooppractice {
    public static void main(String[] args) {
        one();
    }

    private static void one() {
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(j +"x"+i +"="+i*j);
            }
        }



    }


}
/*
//    multiplication table
 */