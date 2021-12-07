package Vererbung;

public class StudentFach extends Student {
    String fachBereich;

    public StudentFach(String name, int age, boolean isMale, String fachBereich) {
        super(name, age, isMale);
        this.fachBereich = fachBereich;
    }

    public String getFachsemester() {
        return fachBereich;
    }

}
