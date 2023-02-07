package week4_09_11_2022;

public class MultiBranchIf {

    public static void main(String[] args) {

        int diameter = 25;

        if(diameter == 25){
            System.out.println("this is a basketball");
        } else if (diameter == 15) {
            System.out.println("This is a football");
        } else if (diameter == 10) {
            System.out.println("this is a tennis ball");
        }else {
            System.out.println(" maybe it's a ping pong ball");
        }
    }
}