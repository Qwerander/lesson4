package controller;

import model.Student;
import service.StudentGroupService;

public class StudentGroupController implements GroupController<Student> {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    @Override
    public void add(Student student) {
        service.addStudent(student);
    }

    @Override
    public void update(int index, Student student) {
        if (index >= 0 && index < service.getStudentGroup().students.size()) {
            service.getStudentGroup().students.set(index, student);
        }
    }


}
