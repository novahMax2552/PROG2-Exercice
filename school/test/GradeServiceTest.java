package school.test;

import org.junit.jupiter.api.Test;
import school.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    public void testGetExamGrade() {
        Tutor tutor = new Tutor(1, "Dupont", "Jean", LocalDate.of(1980,1,1),
                                "dupont@mail.com", "0600000000", "Parent");
        Student student = new Student(1, "Durand", "Alice", LocalDate.of(2000,5,10),
                                      "alice@mail.com", "0611111111", "G1", tutor);
        Teacher teacher = new Teacher(2, "Martin", "Paul", LocalDate.of(1975,3,15),
                                      "martin@mail.com", "0622222222", "Backend");
        Course course = new Course(1, "PROG2", 6, teacher);
        Exam exam = new Exam(1, "Examen PROG2", course, Instant.now(), 2);

        Grade grade = new Grade(student, exam, 12.0);
        grade.addChange(15.0, Instant.now(), "Correction erreur");

        List<Grade> grades = new ArrayList<>();
        grades.add(grade);

        GradeService service = new GradeService();
        double note = service.getExamGrade(exam, student, Instant.now(), grades);

        assertEquals(15.0, note);
    }
}
