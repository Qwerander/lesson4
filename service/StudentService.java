package service;

import model.Student;

public class StudentService {

    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

}
