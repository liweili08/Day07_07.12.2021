package University;

public class Student extends AbstractUniStudent{
    int fachsemester;

    public Student(String name, int age, boolean isMale, int fachsemester) {
        super(name, age, isMale);
        this.fachsemester = fachsemester;
    }

//    public Student() {
//        super();
//    }

    public int getFachsemester() {
        return fachsemester;
    }

    @Override
    public int anzahlModule() {
        int anzahlModule = 32;
        System.out.print("Es gibt " +anzahlModule +"Semesterwochenstunden.");
        return anzahlModule;
    }
}
