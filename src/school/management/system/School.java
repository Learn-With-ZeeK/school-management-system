package school.management.system;

import java.util.List;


public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

 
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

   //returning list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

   //Adding a teacher
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //returning list of students
    public List<Student> getStudents() {
        return students;
    }

    //Adding a student
    public void addStudent(Student student) {
        students.add(student);
    }

    //Total Money Earned by school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

   //Updating Money Earned
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

   //Money Spent
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

   //Updating Money Spent by school
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
