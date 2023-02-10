package week14_25_01_2023.abstraction;

/*
  The main purpose of a class is to create an object,
  but if one class is abstract class, the main purpose
  is no more to create object, it's main goal is to provide some
  method or variable to sub classes.
  regular class can have regular method and abstract method   --> false
  abstract class can have regular method and abstract method  --> true
 */
public abstract class Course {

    String name;
    String teacher;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public abstract void teaching();

    public  abstract String duration();




}
