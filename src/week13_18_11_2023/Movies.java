package week13_18_11_2023;

public class Movies {

    String name;
    String type;
    String director;

    final String genre = "Action";

    public Movies(String name, String type, String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }



    public void play(){
        System.out.println("Now playing " + name);
//        genre = "Horror";
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}