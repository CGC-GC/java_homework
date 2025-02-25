package PR17;
import PR17.entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        students.add(new Student("Иванов Иван Иванович", "1234567890", 4.5));
        students.add(new Student("Петров Петр Петрович", "9876543210", 3.8));
        students.add(new Student("Сидоров Сидор Сидорович", "1357924680", 4.2));

        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore).reversed());

        System.out.println("Введите ФИО студента для поиска:");
        String searchFullName = scanner.nextLine();

        try {
            Student foundStudent = findStudentByFullName(students, searchFullName);
            System.out.println("Найден студент: " + foundStudent);
        } catch (StudentNotFoundException exception) {
            System.out.println("Студент '" + searchFullName + "' не найден.");
        }

        System.out.println("Введите ИНН для проверки:");
        String innToCheck = scanner.nextLine();

        if (isValidInn(innToCheck)) {
            System.out.println("ИНН действителен.");
        } else {
            System.out.println("ИНН недействителен.");
        }
    }
    private static Student findStudentByFullName(List<Student> students, String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент '" + fullName + "' не найден.");
    }
    private static boolean isValidInn(String inn) {
        return inn.length() == 10;
    }
}
