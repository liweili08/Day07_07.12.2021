package NewUniversity;

abstract class AbstractUniStudent {
    String name;
    int age;
    boolean isMale;
    double note;
    boolean isRepresentative; //ist der Student der Studenten-Vertreter?

    public AbstractUniStudent(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    //normal method
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


    //abstract method
    public abstract int anzahlModule();

}

