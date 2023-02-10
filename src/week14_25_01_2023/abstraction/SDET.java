package week14_25_01_2023.abstraction;

public class SDET extends Course{

    public SDET(String name, String teacher) {
        super(name,teacher );
    }

    @Override
    public void teaching() {
        System.out.println("Muhtar is teaching Java");
    }

    @Override
    public String duration() {
        return "The course last 8 months";
    }
}
