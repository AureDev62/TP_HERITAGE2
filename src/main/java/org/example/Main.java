package org.example;

import org.example.exo1.Person;
import org.example.exo1.Student;
import org.example.exo1.Teacher;

public class Main {
    public static void main() {

        //System.out.println("Hello world!");

        Person person = new Person();
        person.SayHello();

        Student student =new Student();
        student.setAge(15);
        student.GoToClasses();
        student.DisplayAge();

        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.SayHello();
        teacher.Explain();


    }
}