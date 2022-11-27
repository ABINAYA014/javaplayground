public class ClassExample {

    public static void main(String[] args) {
        Student newStudent = new Student("Naga","012","20/10/1999",GENDER.MALE);
        System.out.println(newStudent.studentName);
        System.out.println(newStudent.rollNo);
        newStudent.study();
        newStudent.play();
    }
}

/*
 * Student Name - String
 * Student Roll no - Int
 * Student DOB - Date
 *
 */

/**
 * A class is an Entity which has certain characteristics and functionalities within it
 */
class Student {

    public String studentName;
    public String rollNo;
    public String Dob;
    public GENDER studentGender;

    Student(String name,String rollNum,String DOB,GENDER gender) {
        this.studentName = name;
        this.rollNo = rollNum;
        this.Dob = DOB;
        this.studentGender = gender;
    }

    public void study() {
        System.out.println(studentName+" is Studying");
    }

    public void play() {
        System.out.println(studentName+ "is playing");
    }
}

enum GENDER {
    MALE,
    FEMALE,
    TRANSGENDER
}
