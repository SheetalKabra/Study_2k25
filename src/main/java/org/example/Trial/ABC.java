package org.example.Trial;


class Parent1{
    public void m1()throws ArrayIndexOutOfBoundsException{
        //hi
    }
}

class Child1 extends Parent1{
    @Override
    public void m1() throws NullPointerException {
        //ok
    }
}

public class ABC{

    public static void main(String[] args) {

    }

}
