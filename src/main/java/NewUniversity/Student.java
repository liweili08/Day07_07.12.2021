package NewUniversity;

public class Student {
    public String name;
    private int age;
    private int studentId;
    private double note;
    private boolean isRepresentative; //ob der Student der Studenten-Vertreter ist

    //Constructor
//    public Student(String name, int age, int studentId, double not) {
//        this.name = name;
//        this.age = age;
//        this.studentId = studentId;
//    }


    public Student(String name, int age, int studentId, double note, boolean isRepresentative) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.note = note;
        this.isRepresentative = isRepresentative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public boolean isRepresentative() {
        return isRepresentative;
    }

    public void setRepresentative(boolean representative) {
        isRepresentative = representative;
    }

    @Override
    public String toString() {
        return "Name: " + name  +
                ", Age: " + age +
                ", StudentId: " + studentId  +
                ", Note: " + note +
                ", Representative: " + isRepresentative;
    }

}
