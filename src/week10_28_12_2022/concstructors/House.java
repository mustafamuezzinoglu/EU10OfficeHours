package week10_28_12_2022.concstructors;

public class House {

    public String address;
    public int year;
    public String type;

    public House(String newAddress){
        address = newAddress;
    }

    public House(String newAddress, int builtYear){
        address = newAddress;
        year = builtYear;
    }

}
