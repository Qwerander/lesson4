package model;

public class Student extends User {

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Студент [ID: " + id + ", Имя: " + name + ", Фамилия: " + lastName + "]";
    }
}
