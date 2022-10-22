package oop_concepts;

public class Student {
    //properties

    String studentName;
    int regNumber;
    String courseName;

    //initializing the object- constructor

    public Student(String studentName, int regNumber, String courseName){
        this.studentName= studentName;
        this.regNumber = regNumber;
        this.courseName = courseName;
    }

    //methods : getters and setters
    //setters are void as they don't return any value

    public void setName(String studentName){
        this.studentName = studentName;
    }

    public void setReg(int regNumber){
        this.regNumber = regNumber;
    }

    public void setCourse(String courseName){
        this.courseName = courseName;
    }

    //getters

    public String getStudentName(){
        return studentName;
    }

    public int getRegNumber(){
        return regNumber;
    }

    public String getCourseName(){
        return courseName;
    }

    //initializing an object

    public static void main (String[] args){
        Student kayla = new Student("Kayla", 23456, "Law");
        System.out.println(kayla.courseName);
    }

}
