package models;
/**
 * @author fitto
 * @version 1.0
 * @created 03-sep.-2024 18:01:21
 */

public class Student {

    private float average;
    private String carreer;
    private String cif;
    private String firstName;
    private String lastName;
    private boolean Schoolarship;

    public Student(){

    }

    public Student(float average, String carreer, String cif, String firstName, String lastName, boolean schoolarship) {
        this.average = average;
        this.carreer = carreer;
        this.cif = cif;
        this.firstName = firstName;
        this.lastName = lastName;
        Schoolarship = schoolarship;
    }

    public float getAverage() {
        return average;
    }

    public String getCarreer() {
        return carreer;
    }

    public String getCif() {
        return cif;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isSchoolarship() {
        return Schoolarship;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setCarreer(String carreer) {
        this.carreer = carreer;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSchoolarship(boolean schoolarship) {
        Schoolarship = schoolarship;
    }

    public void finalize() throws Throwable{

    }

}