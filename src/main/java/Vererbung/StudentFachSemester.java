package Vererbung;

import model.Student;

public class StudentFachSemester extends Student {
    int fachsemester;

    public StudentFachSemester(String name, int age, boolean isMale, int fachsemester) {
        super(name, age, isMale);
        this.fachsemester = fachsemester;
    }

    public int getFachsemester() {
        return fachsemester;
    }
}
