package model;

public class Geschichtsstudent implements IStudent {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean isMale() {
        return isMale;
    }

    @Override
    public String[] schwerPunkt() {
        String[] schwerPunkt = new String[]{"Geschichte","Deutschland"};
        return schwerPunkt;
    }
}
