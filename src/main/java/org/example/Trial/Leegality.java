package org.example.Trial;

class Student{
    Student(){
        System.out.println("student");
    }
}

class Ram extends Student{
    Ram(){
        System.out.println("ram");
    }
}

public class Leegality {

    public static void main(String[] args) {
        Ram r = new Ram();
        System.out.println();
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));
    }
}
