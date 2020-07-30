package school.grades;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GradesTestSuite {

    @Test
    public void IsGradeProperlyAdd() {
    Grades grade = new Grades();
    grade.add(2);
    grade.add(5);
    grade.add(1);
    grade.add(4);
        System.out.println(grade.getAverage());
    assertEquals(3,grade.getAverage() );}
}
