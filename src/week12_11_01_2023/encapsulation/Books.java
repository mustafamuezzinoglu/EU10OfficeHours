package week12_11_01_2023.encapsulation;

public class Books {

    static BookInfo cydeo = new BookInfo("Cydeo", 2015, 2586321470L,true);


    public  static void main(String[] args) {
        System.out.println(cydeo.getBookName());
        System.out.println(cydeo.getYear());
        cydeo.setYear(2020);
        System.out.println(cydeo.getYear());
//        cydeo.setBorrowed(false); if we want to change set the borrowed to false
        System.out.println(cydeo.isBorrowed());


    }
}
