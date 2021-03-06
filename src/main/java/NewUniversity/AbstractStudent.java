package NewUniversity;

public abstract class AbstractStudent {
    String name;
    int age;
    boolean isMale;
    double note;
    boolean isRepresentative; //ob der Student der Studenten-Vertreter ist

    public AbstractStudent(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public abstract void anzahlModule();

}

