package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Teacher;


public class TeachersService {

    private List<Teacher> teachers = new ArrayList<>();


    public List<Teacher> sort() {
        Collections.sort(teachers);
        return teachers;
    }


    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teachers);
    }


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


    public List<Teacher> getTeachers() {
      return teachers;
    }
}
