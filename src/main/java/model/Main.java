package model;

public class Main {
    public static void main(String[] args){
     InformatikStudent infSt1 = new InformatikStudent();
     Geschichtsstudent gesSt1 = new Geschichtsstudent();
        System.out.println(infSt1.getName());
        System.out.println(gesSt1.getAge());
        System.out.println(infSt1.schwerPunkt());
        System.out.println(gesSt1.schwerPunkt()[1]);
    }
}
