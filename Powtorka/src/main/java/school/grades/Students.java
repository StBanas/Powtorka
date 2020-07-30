package school.grades;


public class Students {
    private String name;
    private Grades math;

    public Students(String name) {
        this.name = name;
        this.math = new Grades();

    }

    public void addMathGrade(int value) {
        if (value >= 0 && value < 7)
            this.math.add(value);
    }

    public Grades getMath() {
        return math;
    }

}