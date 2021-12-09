package NewUniversity;

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
            System.out.println( this.studentArray[i].toString());
        };
        return;
    }

    public int getStudentCount(){
        int studentCounter = 0;
        for (int i = 0; i < this.studentArray.length; i++) {
            if (this.studentArray[i] != null){
                studentCounter++;
            }
        };
        return studentCounter;
    }



//    public Student[] getStudents{
//return students;
//    }


  //  public Student[] getStudentArray() {
  //      return studentArray;
   // }


  //  public void addStudent(){

    }

 //   public void removeStudents(){

    }

//    public int getBestStudents(){
//    return note;
//    }

//    public int getAverageGrade(){
//    return note;
//    }

 //   public void getStudentRepresentative(){

    }

}
