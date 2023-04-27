import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    @Test
    public void getCohortAverage() {
        Cohort cohort = new Cohort();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        student1.addGrade(80);
        student1.addGrade(90);
        student2.addGrade(70);
        student2.addGrade(80);
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        assertEquals(80, cohort.getCohortAverage(), 0.01);
    }
    @Test
    public void addStudent(){
        Cohort cohort = new Cohort();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        assertEquals(2, cohort.getStudents().size());
    }
    @Test
    public void getStudents(){
        Cohort cohort = new Cohort();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        assertEquals(2, cohort.getStudents().size());
    }
}
