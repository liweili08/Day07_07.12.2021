package NewUniversity;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Anna", 21, 2021001, 3.0,false);
        Student stu2 = new Student("Christina", 18, 2021002,1.7,false);
        Student stu3 = new Student("Daniel", 20, 2021003,2.3,false);
        Student stu4 = new Student("Felix", 19, 2021004,1.0,true );

        Student stu5 = new Student("Hans", 22, 2021005,4.0,false);
        Student stu6 = new Student("Jan", 20, 2021006,2.0,false);
        Student stu7 = new Student("Thomas", 22, 2021007,1.3,false);

        Student stu8 = new Student("Michael",17,2021008,1.0,false);

        Student[] studentsArray1 = new Student[4];
        studentsArray1[0] = stu1;
        studentsArray1[1] = stu2;
        studentsArray1[2] = stu3;
        studentsArray1[3] = stu4;

        Student[] studentsArray2 = new Student[3];
        studentsArray2[0] = stu5;
        studentsArray2[1] = stu6;
        studentsArray2[2] = stu7;

        University myUni1 = new University("RWTH", studentsArray1, true);
        University myUni2 = new University("LMU", studentsArray2, false);

        myUni2.toList();
        System.out.println(myUni2.getStudentCount());

        myUni2.setStudentRepresentative(true);

//addStudent1:
//        Student[] newstudentsArray2 = myUni2.addStudent(stu8);
//        University newUni2 = new University("LMU",newstudentsArray2,false);
//        newUni2.toList();
        //addStudent2:
        myUni2.addStudent(stu8).toList();
        System.out.println("*******************");

        myUni1.removeStudents(stu4).toList();

        System.out.println("***********");

        myUni2.addStudent(stu8).getBestStudent();

        System.out.println("***********");
        myUni1.getAverageGrade();

        System.out.println("***********");
myUni2.setStudentRepresentative(true);

//Student[] testList = generateStudentList();
    }

//    public static Student[] generateStudentList(){
//
//        Student[] testList = new Student[5];
//        testList[0] = new Student("a",21,false,2);
//        testList[1] = new Student("a",21,false,2);
//        testList[2] = new Student("a",21,false,2);
//     return testList;
//    }
}
