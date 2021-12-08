package University;

public class University {
    String uniName;
    Student[] students;
    boolean studentRepresentative;

    public University(String uniName, Student[] students, boolean studentRepresentative) {
        this.uniName = uniName;
        this.students = students;
        this.studentRepresentative = studentRepresentative;
    }

//    public Student[] getStudents{
//return students;
//    }


    public Student[] getStudentArray() {
        return students;
    }

    public int getStudentCount(){
        int countStudent =0;
        for (int i=0; i<students.length;i++){
            if(students[i]!= null){
                countStudent++;
            }
        }
return countStudent;
    }

    public void addStudent(){

    }

    public void removeStudents(){

    }

//    public int getBestStudents(){
//    return note;
//    }

//    public int getAverageGrade(){
//    return note;
//    }

    public void getStudentRepresentative(){

    }

}
