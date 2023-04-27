import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void getId() {
        Student student = new Student(1, "John");
       assertEquals(1, Student.getId());
    }
    @Test

    public void getName() {
        Student student = new Student(1, "John");
        assertEquals("John", Student.getName());
    }
    @Test
    public void addGrade(){
        Student student = new Student(1, "John");
        assertEquals(Student.grades, Student.addGrade(80));
    }
    @Test

    public void getGrades(){
        assertEquals(Student.grades, Student.getGrades());
    }
    @Test
    public void getGradeAverage(){
        Student student = new Student(1, "John");
        Student.addGrade(80);
        Student.addGrade(90);
        assertEquals(85, Student.getGradeAverage());
    }
}