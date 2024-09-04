package models;
/**
 * @author fitto
 * @version 1.0
 * @created 03-sep.-2024 18:01:17
 */

public class Admision {

    public Admision(){

    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param Student
     */
    public void calSchoolarship(Student Student) {
        Student.setSchoolarship(Student.getAverage() >= 80);
    }
}