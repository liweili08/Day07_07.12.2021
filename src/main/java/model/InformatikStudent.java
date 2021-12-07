package model;

public class InformatikStudent implements IStudent {
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
        String[] schwerPunkt = new String[]{"Mathe", "Infomatik", "ComputerAlgebra"};
        return schwerPunkt;
    }
}
