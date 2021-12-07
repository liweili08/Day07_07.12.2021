package model;

public interface IStudent {
    public static final String name = "Daniel";
    public static final int age = 18;
    public static final boolean isMale = true;

    public abstract String getName();
    public abstract int getAge();
    public abstract boolean isMale();
    public abstract String[] schwerPunkt();
}

