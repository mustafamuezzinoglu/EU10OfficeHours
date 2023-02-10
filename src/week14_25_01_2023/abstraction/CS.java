package week14_25_01_2023.abstraction;

public class CS extends Course{

    public CS (String name, String teacher) {
        super(name,teacher );
    }

    @Override
    public void teaching() {

    }

    @Override
    public String duration() {
       return null;
    }
}
