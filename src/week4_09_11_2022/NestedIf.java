package week4_09_11_2022;

public class NestedIf {

    public static void main(String[] args) {


        boolean isEmployee = !true;
        boolean isStudent = !true;
        boolean isOldStudent = true;
        boolean isAccountDep =! true;
        boolean isSalesDep = !true;

        if(isEmployee){

            if (isAccountDep){
                System.out.println("pelase go to account office");
            } else if (isSalesDep) {
                System.out.println("Please go to sales office");
            }
        } else if (isStudent) {
            if (isOldStudent){
                System.out.println("please go to classroom");
            }
        }else {
            System.out.println("get out of here");
        }
    }




}