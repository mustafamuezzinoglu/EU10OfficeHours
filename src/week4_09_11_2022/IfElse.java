package week4_09_11_2022;

public class IfElse {

    public static void main(String[] args) {

        boolean isEmpty = true;
        if (isEmpty) { // parantesz ici dogru ise bu islem gerceklesir
            System.out.println("Please  go to gas station");

        } else { // burasi if deki parantez ici dogru degilse gerceklesir
            System.out.println("please go on");
        }

        int price = 1000;
        int cash = 900;

        if (cash >= price){
            System.out.println("I can afford it");
        }else{
            System.out.println("I can't afford it");
        }

    }

}