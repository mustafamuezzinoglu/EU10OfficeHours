package week14_25_01_2023.polymorphism.ED;

public class Practice {

    static ElectronicDevice device1 = new Television();
    static ElectronicDevice device2 = new AirConditioner();

    public static void main(String[] args) {
        device1.turnOn();
        device2.turnOn();

        if (device1 instanceof AirConditioner){
            device1.turnOn();
        }else {
            device2.turnOn();
        }
    }
}