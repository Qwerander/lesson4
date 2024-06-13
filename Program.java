import controller.StudentController;
import controller.StudentGroupController;
import controller.TeacherController;
import controller.TeachersController;
import model.Student;
import model.StudentGroup;
import model.Teacher;
import service.StudentGroupService;
import service.StudentService;
import service.TeacherService;
import service.TeachersService;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Создание сервиса и контроллера для студентов
        StudentService studentService = new StudentService();
        StudentController studentController = new StudentController();

        // Создание студентов
        Student student1 = studentService.createStudent(1, "Иван", "Иванов");
        Student student2 = studentService.createStudent(2, "Мария", "Петрова");
        Student student3 = studentService.createStudent(3, "Петр", "Сидоров");
        Student student4 = studentService.createStudent(4, "Дмитрий", "Козлов");

        // Создание групп студентов
        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();

        // Добавление студентов в группы
        group1.students = new ArrayList<>();
        group2.students = new ArrayList<>();
        group1.students.add(student1);
        group1.students.add(student2);
        group2.students.add(student3);
        group2.students.add(student4);

        // Вывод студентов на консоль после редактирования
        System.out.println("Список студентов в группе 1:");
        studentController.sendOnConsole(group1.students);
        System.out.println("Список студентов в группе 2:");
        studentController.sendOnConsole(group2.students);

        // Создание сервиса и контроллера для групп студентов
        StudentGroupService studentGroupService1 = new StudentGroupService(group1);
        StudentGroupService studentGroupService2 = new StudentGroupService(group2);
        StudentGroupController groupController1 = new StudentGroupController(studentGroupService1);
        StudentGroupController groupController2 = new StudentGroupController(studentGroupService2);

        // Редактирование студентов
        Student updatedStudent = studentService.createStudent(1, "Иван", "Кузнецов");
        groupController1.update(0, updatedStudent);
        Student updatedStudent2 = studentService.createStudent(3, "Алекс", "Сидоров");
        groupController2.update(0, updatedStudent2);

        // Вывод студентов на консоль после редактирования
        System.out.println("Список студентов в группе 1 после редактирования:");
        studentController.sendOnConsole(group1.students);
        System.out.println("Список студентов в группе 2 после редактирования:");
        studentController.sendOnConsole(group2.students);

        // Создание сервиса и контроллера для учителей
        TeacherService teacherService = new TeacherService();
        TeacherController teacherController = new TeacherController();
        TeachersService teachersService = new TeachersService();
        TeachersController teachersController = new TeachersController(teachersService);

        // Создание учителей
        Teacher teacher1 = teacherService.createTeacher(1, "Анна", "Сидорова");
        Teacher teacher2 = teacherService.createTeacher(2, "Борис", "Кузнецов");

        // Добавление учителей
        teachersController.add(teacher1);
        teachersController.add(teacher2);

        // Вывод учителей на консоль
        System.out.println("Список учителей:");
        teacherController.sendOnConsole(teachersService.getAllTeachers());

        // Редактирование учителя
        Teacher updatedTeacher = teacherService.createTeacher(1, "Анна", "Морозова");
        teachersController.update(0, updatedTeacher);

        // Вывод обновленного списка учителей на консоль
        System.out.println("Обновленный список учителей:");
        teacherController.sendOnConsole(teachersService.getAllTeachers());
    }
}
