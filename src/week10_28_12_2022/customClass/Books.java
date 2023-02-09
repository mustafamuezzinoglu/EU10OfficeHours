package week10_28_12_2022.customClass;

public class Books {

    public String name;
    public int year;
    public  String  author;
    public String genres;

    public void setBook(String bookName, String bookAuthor,int publishedYear, String bookGenres){
        name = bookName;
        author = bookAuthor;
        year = publishedYear;
        genres = bookGenres;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("author = " + author);
        System.out.println("year = " + year);
        System.out.println("genres = " + genres);

    }

}
