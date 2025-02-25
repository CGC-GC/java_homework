package PR17.entities;

public class Student {
    private String fullName;
    private String inn;
    private double averageScore;

    public Student(String fullName, String inn, double averageScore) {
        this.fullName = fullName;
        this.inn = inn;
        this.averageScore = averageScore;
    }
    public String getFullName() {
        return fullName;
    }
    public String getInn() {
        return inn;
    }
    public double getAverageScore() {
        return averageScore;
    }
    @Override
    public String toString() {
        return "Student {" +
                "fullName='" + fullName + '\'' +
                ", inn='" + inn + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
