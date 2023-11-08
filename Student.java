package oop2.week4.lecture2;

public class Student {

    private int id;
    private String name;
    private double gpa;
    private String email;

    public Student() {
    }

    public Student(int id, String name, double gpa, String email) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student withId(int id) {
        setId(id);
        return this;
    }

    public Student withName(String name) {
        setName(name);
        return this;
    }

    public Student withGpa(double gpa) {
        setGpa(gpa);
        return this;
    }

    public Student withEmail(String email) {
        setEmail(email);
        return this;
    }

}
