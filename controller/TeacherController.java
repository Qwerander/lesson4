package controller;

import model.Teacher;
import view.TeacherView;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private UserView<Teacher> teacherView = new TeacherView();

    public void sendOnConsole(List<Teacher> teachers) {
        teacherView.sendOnConsole(teachers);
    }

    @Override
    public Teacher create(Teacher teacher) {
        return new Teacher(teacher.getId(), teacher.getName(), teacher.getLastName());
    }

}
