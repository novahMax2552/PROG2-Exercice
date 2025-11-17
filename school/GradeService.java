package school;

import java.time.Instant;
import java.util.List;

public class GradeService {
    public double getExamGrade(Exam exam, Student student, Instant t, List<Grade> grades) {
        for (Grade g : grades)  {
            if (g.getExam().equals(exam)  && g.getStudent().equals(student)) {
                return g.getValeurAt(t);
            }
        }
        return 0.0;
    }

    public double getCourseGrade(Course course, Student student, Instant t, List<Grade> grades) {
        double total = 0;
        int totalCoeff = 0;
        for (Grade g : grades) {
            if (g.getExam().getCourse().equals(course) && g.getStudent().equals(student)) {
                double valeur = g.getValeurAt(t);
                int coeff = g.getExam().getCoefficient();
                total += valeur * coeff;
                totalCoeff += coeff;

            }
        }
         
        return totalCoeff == 0 ? 0.0 : total / totalCoeff;
    }
}
