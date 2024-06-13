package view;

import model.Student;

import java.util.Collections;
import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {

        Collections.sort(students);
        System.out.println(students);
    }
}
