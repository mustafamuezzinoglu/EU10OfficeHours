package week14_25_01_2023.polymorphism.hospital;

public class Practice {

    static Employee nurse = new Nurse();
    static Employee doctor = new Doctor();

    public static void main(String[] args) {
//        Employee employee = new Employee(); it gives checked exception because it is abstract class
        Employee employee1 = nurse; //upcasting
        Nurse nurse1 = (Nurse) employee1; //down casting

        nurse.performJob();
        doctor.performJob();
    }

}
