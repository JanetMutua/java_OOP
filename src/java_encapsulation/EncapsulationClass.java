package java_encapsulation;

public class EncapsulationClass {
    //restrict access to the properties
    private String studentName;
    private int regNumber;
    private String courseName;

    //initializing the object- constructor

    public EncapsulationClass(String studentName, int regNumber, String courseName){
        this.studentName= studentName;
        this.regNumber = regNumber;
        this.courseName = courseName;
    }

    //setters - define how the properties can be set by the outside world

    public void setName(String studentName){
        this.studentName = studentName;
    }

    public void setReg(int regNumber){
        this.regNumber = regNumber;
    }

    public void setCourse(String courseName){
        this.courseName = courseName;
    }

    //getters - define how the world can access the properties

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
        EncapsulationClass kayla = new EncapsulationClass("Kayla", 23456, "Law");
        System.out.println(kayla.courseName);
    }
}
