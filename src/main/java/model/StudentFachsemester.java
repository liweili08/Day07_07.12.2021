package model;

public class StudentFachsemester extends Student {
    int fachsemester;

    public StudentFachsemester(String name, int age, boolean isMale, int fachsemester) {
        super(name, age, isMale);
        this.fachsemester = fachsemester;
    }

    public int getFachsemester() {
        return fachsemester;
    }
}
