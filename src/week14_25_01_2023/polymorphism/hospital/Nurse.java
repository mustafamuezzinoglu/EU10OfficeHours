package week14_25_01_2023.polymorphism.hospital;

public class Nurse extends Employee{

    @Override
    public void performJob() {
        System.out.println("I'm performing nurse job");
    }
}
