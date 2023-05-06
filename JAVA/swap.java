package JAVA;

public class swap {
    static class Person{
        int age;
        String name;

        void sayHi(){
            System.out.println(this.name + "[" + this.age + "] says hi...");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "A";
        p1.age = 10;
        Person p2 = new Person();
        p2.name = "B";
        p2.age = 20;

        Person temp = p1;
        p1 = p2;
        p2 = temp;

        p1.sayHi();
        p2.sayHi();
    }
}
