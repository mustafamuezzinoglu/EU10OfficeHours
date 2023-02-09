package week10_28_12_2022.customClass;

public class Movies {

    public String title;
    public String director;
    public int year;
    public double rating;

    public void getTitle() {
        System.out.println(title);
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String movieName) {
        title = movieName;
    }

    public void setDirector(String newDirector) {
        director = newDirector;
    }

public void movieInfo(){

    System.out.println("The movie title is " +title + ", directed by " + director);

}

}
