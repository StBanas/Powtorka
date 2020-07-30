package school.grades;

import org.junit.Test;

public class StudentTestSuite{
    @Test

    public void  IsGradeProperlyAdd(){
        Students student = new Students("John");
        student.addMathGrade(7);
        student.addMathGrade(3);
        student.addMathGrade(1);
        for (int i=0; i < 3; i++)
        System.out.println(student.getMath().toString());


}
}