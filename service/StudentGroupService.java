package service;

import model.Student;
import model.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;
    private List<Student> students = new ArrayList<>();

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
