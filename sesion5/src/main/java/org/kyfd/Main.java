package org.kyfd;

import models.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.println("Ingresa el promedio del estudiante: ");
            float promedio = sc.nextfloat();
            student.setAverage (promedio);
            admision.calcSchoolarship(student);
            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student.getAverage() + " " + student.isSchoolarship());

        }
    }
}