package NewUniversity;

public class Student {
    public String name;
    private int age;
    private int studentId;
    double note;
    boolean isRepresentative; //ob der Student der Studenten-Vertreter ist

    //Constructor
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Name=" + name + '\'' +
                ", Age=" + age +
                ", StudentId=" + studentId;
    }



}
