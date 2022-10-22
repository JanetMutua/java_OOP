package java_access_modifiers;

import oop_concepts.Student;

public class Main {
    public static void main(String[] args) {

        //=============================access modifiers concept===========================================
        
        Student y  = new Student("Rose", 23345, "Art");
        System.out.println(y.getCourseName());
    }
}
