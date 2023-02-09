package week10_28_12_2022.concstructors;

public class HouseObject {

    public static void main(String[] args) {
  /*      House house= new House();
        house.address = "chiago";
        house.year = 1980;
        house.type = "mansion";
        System.out.println(house);
*/

        House house1= new House("New York");
        System.out.println(house1.address );

        House house2= new House("Chiago",2009);
        System.out.println(house2.address );
        System.out.println(house2.year);
        System.out.println(house2.type);








    }


}
