package Vererbung;

import model.Geschichtsstudent;
import model.InformatikStudent;
import model.StudentFachsemester;

public class Main {
    public static void main(String[] args) {
        StudentFach fach = new StudentFach("Anna", 21, false, "Mathe");

        StudentFachsemester sem = new StudentFachsemester("Anne", 18, false, 6);
        System.out.println(sem.getFachsemester());
        System.out.println(fach.fachBereich);
    }

}

