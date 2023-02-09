package week11_04_01_2023.accessModifiers;

public class AccessModifiers {

    public int a = 10;
    protected  int b = 20;
    int c = 30;
    private int d = 40;


    public  void main(String[] args) {

        System.out.println(a);
    }

    public void one(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    protected void three(){
        System.out.println("three");
    }

    void four(){
        System.out.println("four");
    }

    private void five(){
        System.out.println("five");
    }
}