package org.example.Trial;

public class ConsChaining {
    public static void main(String[] args) {
        new Childs();
    }
}


class Parents{
    Parents(){
        System.out.println("Parent ");
    }
    Parents(int y){
        System.out.println("Parent : "+y);
    }
}
class Childs extends Parents{
    Childs(){
        this(5);
        System.out.println("Child default");
    }

    Childs(int x){
        super(4);
        System.out.println("Child param: "+x);
    }
}


