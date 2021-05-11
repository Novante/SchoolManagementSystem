package dao;

import static schoolmanagementsystem.HelpFunctions.readInt;
import static schoolmanagementsystem.SchoolManagementSystem.sc;

public class CourseFunctions {

    static CourseDao courseDao = new CourseDao();

    public static void removeCourse() {
        System.out.println("ID:");
        int id = readInt();
        courseDao.removeCourse(id);
    }

    public static void showAllCourses() {
        courseDao.showAllCourses();
    }

    public static void showCourseInfo() {
        System.out.println("ID:");
        int id = readInt();
        courseDao.showCourseInfo(id);
    }

    public static void updateCourse() {
        System.out.println("ID:");
        int id = readInt();
        System.out.println("New course name:");
        String newName = sc.nextLine();
        System.out.println("New course credit:");
        String newCredit = sc.nextLine();
        courseDao.updateCourse(id, newName, newCredit);
    }

    public static void addCourse() {
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Credit:");
        String credit = sc.nextLine();
        courseDao.addCourse(name, credit);
    }

}
