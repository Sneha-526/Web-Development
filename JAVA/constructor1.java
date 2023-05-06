package JAVA;

class Base{
    Base(){
        System.out.println("I am a constructor");

    }
    Base(int a){
        System.out.println("I am an overloaded constructor with value of a as: " + a);

    }

}
class Derive extends Base{
    Derive(){
        System.out.println("I am derived class constructor");

    }
    Derive(int a, int b){
        super(a);
        System.out.println("I am an overloaded constructor with value of a and b as:" + a + " " + b);
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Derive d = new Derive(4,9);
        System.out.println();
        Derive a = new Derive();
        System.out.println(d);
        System.out.println(a);
    }
}
