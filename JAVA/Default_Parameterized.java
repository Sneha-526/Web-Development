package JAVA;

public class Default_Parameterized {
    public static void main(String[] args) {
        Student s = new Student(10,"A");
        s.age = 20;
        s.name = "B";
    }
    static class Student{
        int age;
        String name;
        Student(int age, String name){
            this.age = age;
            this.name = name;
            System.out.println("name = " + this.name + " and age = " + this.age);
        }
        Student(){

        }
    }
}
