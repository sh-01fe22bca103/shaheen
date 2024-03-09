import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Student1{
    private String name;
    private LocalDate dateOfBirth;

    public Student1(String name, String dateOfBirth) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayStudentAge() {
        LocalDate currentDate = LocalDate.now();
        long age = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("shaheen", "2004-04-06");
        student.displayStudentName();
        student.displayStudentAge();
    }
}