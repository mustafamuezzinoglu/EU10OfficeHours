package week10_28_12_2022.concstructors;

public class ApplicationObject {

    public static void main(String[] args) {

        Application app1 = new Application("Instagram");
        Application app2 = new Application("Facebook","10.3");
        Application app3 = new Application("Youtube", "2.8","Tomcat");

        System.out.println("app1 "+app1);
        System.out.println("app2 "+app2);
        System.out.println("app3 "+app3);



    }
}
