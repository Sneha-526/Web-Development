package JAVA;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Muskan...");
    }
}

class Square{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (2*(length + breadth));
    }
}

public class oops {
    public static void main(String[] args) {
        // Employee emp1 = new Employee();
        // emp1.setName("Sneha");
        // System.out.println(emp1.getName());
        // emp1.salary = 233;
        // System.out.println(emp1.getSalary());

        // CellPhone oneplus = new CellPhone();
        // oneplus.callFriend();
        // oneplus.vibrate();
        // oneplus.ring();

        Square sq = new Square();
        sq.length = 4;
        sq.breadth = 2;
        int area = sq.area();
        int perimeter = sq.perimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
}
