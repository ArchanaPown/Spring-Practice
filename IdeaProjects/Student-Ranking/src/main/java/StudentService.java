
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {

    public void printStudentRankings(List<Student> students) {
        // Create a custom comparator for ranking
        Comparator<Student> rankComparator = Comparator
                .comparingInt(Student::getMarks).reversed()
                .thenComparingInt(Student::getId);

        // Sort the list using the custom comparator
        students.sort(rankComparator);

        System.out.println("--- Student Ranking (by Marks, then ID) ---");
        students.forEach(System.out::println);
    }
}