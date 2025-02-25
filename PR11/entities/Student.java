package PR11.entities;

public class Student {
    private int iDNumber;
    private String name;
    private double GPA;

    public Student(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }
    public int getIDNumber() {
        return iDNumber;
    }
    public String getName() {
        return name;
    }
    public double getGPA() {
        return GPA;
    }
}
