package model;

public class Student {
    public Student() {
        super();
    }

    public Student(String name) {
        super();
        this.name = name;
    }
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
