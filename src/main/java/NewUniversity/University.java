package NewUniversity;

import java.util.Scanner;

public class University {
    String uniName;
    Student[] studentArray;
    boolean studentRepresentative;

    //Constructor
    public University(String uniName, Student[] studentArray, boolean studentRepresentative) {
        this.uniName = uniName;
        this.studentArray = studentArray;
        this.studentRepresentative = studentRepresentative;
    }

    //Methode listStudents: gibt alle Studenten zurück
    public void toList() {
        for (int i = 0; i < this.studentArray.length; i++) {
            System.out.println(this.studentArray[i].toString());
        }
        return;
    }

    public int getStudentCount() {
        int studentCounter = 0;
        for (int i = 0; i < this.studentArray.length; i++) {
            if (this.studentArray[i] != null) {
                studentCounter++;
            }
        }
        return studentCounter;
    }


    // Methode addStudent: damit kan man einen Student einschreiben
    //addStudent 1:
//    public Student[] addStudent(Student stuAdd) {
////        System.out.println("Geben Sie den Name des Studenten:");
////        Scanner scanAddStudent = new Scanner(System.in);
////        String addName = scanAddStudent.nextLine();
////        System.out.println("Geben Sie die Alte des Studenten:");
////        int addAge = scanAddStudent.nextInt();
////        System.out.println("Geben Sie den StudentenID Studenten:");
////        int addId = scanAddStudent.nextInt();
////        System.out.println("Geben Sie die Note Studenten:");
////        double addNote = scanAddStudent.nextDouble();
////        System.out.println("Ist der Student der Studenten-Vertreter? (true/false)");
////        boolean addIsRepresentative = scanAddStudent.nextBoolean();
////        Student addStudent = new Student(addName, addAge, addId, addNote, addIsRepresentative);
//        Student[] addOneList = new Student[this.studentArray.length + 1];
//        for (int i = 0; i < this.studentArray.length; i++) {
//            addOneList[i] = this.studentArray[i];
//        }
//        addOneList[this.studentArray.length] = stuAdd;
//        return addOneList;
//    }

    //addStudent 2:
    public University addStudent(Student stuAdd) {
        Student[] addOneList = new Student[this.studentArray.length + 1];
        for (int i = 0; i < this.studentArray.length; i++) {
            addOneList[i] = this.studentArray[i];
        }
        addOneList[this.studentArray.length] = stuAdd;
        University neuUni = new University(this.uniName, addOneList, this.studentRepresentative);
        return neuUni;
    }

    //  Methode: removeStudent: um einen Student zu entfernen
    public University removeStudents(Student stuRemove) {
//        System.out.println("Geben Sie den Name des Studenten:");
//        Scanner scanRemoveStudent = new Scanner(System.in);
//        String removeName = scanRemoveStudent.nextLine();
//        System.out.println("Geben Sie die Alte des Studenten:");
//        int removeAge = scanRemoveStudent.nextInt();
//        System.out.println("Geben Sie den StudentenID Studenten:");
//        int removeId = scanRemoveStudent.nextInt();
//        System.out.println("Geben Sie die Note Studenten:");
//        double removeNote = scanRemoveStudent.nextDouble();
//        System.out.println("Ist der Student der Studenten-Vertreter? (true/false)");
//        boolean removeIsRepresentative = scanRemoveStudent.nextBoolean();
        //       Student removeStudent = new Student(removeName, removeAge, removeId, removeNote, removeIsRepresentative);
        Student[] currentList = new Student[this.studentArray.length - 1];
        int indexRemove=0;
        int i= 0;
        while (i < this.studentArray.length) {
            if (this.studentArray[i] != stuRemove) {
                i++;
            } else {
                indexRemove = i;
                break;
            }
        }
        for (int j=0; j<indexRemove;j++){
            currentList[j] = this.studentArray[j];
        }
        for (int j= indexRemove+1;j<this.studentArray.length;j++){
            currentList[j-1] =this.studentArray[j];
        }

        University neuUni = new University(this.uniName,currentList,this.studentRepresentative);
        return neuUni;
    }

    //Methode getBestStudent: gibt den Student mit der besten Note zurück
    public void getBestStudent() {
        double bestNote = 5.0;
        String bestStudent = "";
        for (int i = 0; i < this.studentArray.length; i++) {
            if (this.studentArray[i].getNote() <= bestNote) {
                bestNote = this.studentArray[i].getNote();
                bestStudent += this.studentArray[i].getName()+" ";
            }
        }
        System.out.println( "Der beste Student ist (sind) " + bestStudent + " mit der Note " + bestNote);
    }

    //Methode getAverageGrade: gibt die Durchschnitts-Note aller Studenten wieder
    public void getAverageGrade() {
        double sumNote = 0;
        for (int i = 0; i < this.studentArray.length; i++) {
            sumNote += this.studentArray[i].getNote();
        }
        double averageGrade = sumNote / (this.studentArray.length);
        System.out.println("Die Durchschnitts-Note aller Studenten ist " + averageGrade);
    }

    //Methode setStudentRepresentative: um den Studenten Vertreter zu setzten
    public void setStudentRepresentative(boolean studentRepresentative) {
        this.studentRepresentative = studentRepresentative;
        if(studentRepresentative== true){
            System.out.println("Es gibt einen Studenten-Vertreter in der "+this.uniName);
        }else {
            System.out.println("Es gibt keinen Studenten-Vertreter in der "+this.uniName);
        }
    }
}
