package NewUniversity;

public class Student {
    public String name;
    private int age;
    private boolean isMale;
    double note;
    boolean isRepresentative; //ob der Student der Studenten-Vertreter ist

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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    public Student(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
//        public Student(String name, int age) {
//            this.name = name;
//            this.age = age;
//            this.isMale = false;
    }


}
