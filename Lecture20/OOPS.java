package Lecture20;
// import java.util.*;

public class OOPS {
    
    public static void main(String[] args) {

        // Classroom sept24 = new Classroom();

        Instructor inst1 = new Instructor("Shivansh", "Web Development", 88);

        System.out.println(inst1.code + " " + inst1.name + " " + inst1.subject);

        Student stud1 = new Student("Shivansh Bansal","CBPPSETP24",03,"Maharaja Agrasen Institute of Technology", 9.02);

        System.out.println(stud1.name + " " + stud1.batch + " " + stud1.rollNum + " " + stud1.college + " " + stud1.CGPA);

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

    String name;
    int code;
    String subject;

       //constructor
    public Instructor() {



    }
   
       //Custom Constructor
    public Instructor(String n, String s, int c) {
   
        this.name = n;
        this.code = c;
        this.subject = s;       
   
    }

}

class Student {

    String name;
    String batch;
    int rollNum;
    String college;
    double CGPA;

    public Student() {

        System.out.println("Creating student class default constructor");
        this.name = "None";
        this.batch = "Awara";
        this.rollNum = -1;
        this.college = "NA";
        this.CGPA = -1;

    }

    public Student(String name, String batch, int rollNum, String college, double CGPA) {

        this.name = name;
        this.batch = batch;
        this.rollNum = rollNum;
        this.college = college;
        this.CGPA = CGPA;

    }

}
