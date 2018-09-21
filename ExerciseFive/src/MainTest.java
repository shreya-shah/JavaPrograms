import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student(1,21,"mohan");
        Student s2 = new Student(2,21,"sohan");
        Student s3 = new Student(3,21,"rohan");
        Student s4 = new Student(4,21,"rohit");
        Student s5 = new Student(5,21,"mohit");
        Student s6 = new Student();
        s6.setName("java");
        s6.setAge(21);
        s6.setId(6);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        System.out.println(students);
        Collections.sort(students,new StudentSorter());
        System.out.println(students);

    }
}
