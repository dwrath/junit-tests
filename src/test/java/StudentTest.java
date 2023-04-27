import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void getId() {
       assertEquals(1, Student.getId());
    }
    @Test

    public void getName() {
        assertEquals("John", Student.getName());
    }
    @Test
    public void addGrade(int grade){
        assertEquals(Student.grades, Student.addGrade(grade));
    }
    @Test

    void getGrades(){
        assertEquals(Student.grades, Student.getGrades());
    }
    @Test
    public void getGradeAverage(){
        assertEquals(80, Student.getGradeAverage());
    }
}