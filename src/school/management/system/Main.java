package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher nidhi = new Teacher(1,"Nidhi",500);
        Teacher sakshi = new Teacher(2,"Sakshi",700);
        Teacher geeta = new Teacher(3,"Geeta",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(nidhi);
        teacherList.add(sakshi);
        teacherList.add(geeta);


        Student zeeshan = new Student(1,"Zeeshan",4);
        Student sandeep = new Student(2,"Sandeep",12);
        Student sasirekha = new Student(3,"PV Sasirekha",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(zeeshan);
        studentList.add(sandeep );
        studentList.add(sasirekha);




        School ghs = new School(teacherList,studentList);

        Teacher kareena = new Teacher(6,"Kareena", 900);

        ghs.addTeacher(kareena);


        zeeshan.payFees(5000);
        sasirekha.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        nidhi.receiveSalary(nidhi.getSalary());
        System.out.println("GHS has spent for salary to " + nidhi.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        geeta.receiveSalary(geeta.getSalary());
        System.out.println("GHS has spent for salary to " + geeta.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(sandeep);

        sakshi.receiveSalary(sakshi.getSalary());

        System.out.println(sakshi);


    }
}
