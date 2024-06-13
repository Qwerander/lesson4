package view;

import model.Teacher;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        Collections.sort(teachers);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

}
