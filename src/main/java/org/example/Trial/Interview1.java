package org.example.Trial;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

class Parent {
    static void display() throws FileNotFoundException{
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child display");
    }
}

public class Interview1 {
    public static void main(String[] args) throws FileNotFoundException {
        Parent obj = new Child();
        obj.display(); // Output: "Parent display" (not "Child display")


        Child obj1 = new Child();
        obj1.display(); // Output: "Parent display" (not "Child display")
    }
}
