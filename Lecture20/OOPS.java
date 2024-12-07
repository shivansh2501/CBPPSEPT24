package Lecture20;
import java.util.*;

public class OOPS {
    
    public static void main(String[] args) {

        Classroom sept24 = new Classroom();

    }

}

class Classroom {

    Instructor inst;

    Student[] arr;

    public Classroom() {

        System.out.println("A new classroom is created.");

    }

}

class Instructor {

    //Constructor
    public Instructor() {

        

    }

    String name;
    int code;
    String subject;

}

class Student {

    String name;
    String batch;
    int rollNum;
    String college;
    float CGPA;

}
