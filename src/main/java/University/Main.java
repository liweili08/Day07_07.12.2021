package University;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Anna", 21, false, 7);
        Student stu2 = new Student("Christina", 18, false, 1);
        Student stu3 = new Student("Daniel", 20, false, 5);
        Student stu4 = new Student("Felix", 19, true, 4);
        Student stu5 = new Student("Hans", 22, true, 8);

        Student[] students = new Student[5];
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;
        students[3] = stu4;
        students[4] = stu5;
        University myUni = new University("RWTH", students, true);

        myUni.getStudentArray();
        myUni.getStudentCount();

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
