package JAVA;

import java.util.List;

public class Abstract{
    public static void main(String[] args) {
        /*
        Employee obj = new Employee();
        Not Allowed because Employee class is abstract.
        */
        Employee obj;
        obj = new HREmployee(null, "A", 10);
        obj.markAttendance();

        obj = new SoftwareEmployee("", "A", 10);
        obj.markAttendance();
    }
    static abstract class Employee{
        String name;
        int empid;
        Employee(String name, int empid){
            this.name = name;
            this.empid = empid;
        }
        void markAttendance(){
            System.out.println(name + " is present");
        }
        
    }

    static class HREmployee extends Employee{
        List<Integer> salaries;
        
        HREmployee(List<Integer> salaries, String name, int empid){
            super(name,empid);
            this.salaries = salaries;
        }
        void doWork(){
           System.out.println(name + " creates payroll");
        }
    }

    static class SoftwareEmployee extends Employee{
        String conn;

        SoftwareEmployee(String conn, String name, int empid){
            super(name,empid);
            this.conn = conn;
        }

        void doWork(){
           System.out.println(name + " writes code");
        }
    }
}
