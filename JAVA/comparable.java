package JAVA;

import java.util.ArrayList;
import java.util.Collections;

public class comparable {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<Student>();
        a.add(new Student(101, "Vijay", 23));
        a.add(new Student(106, "Ajay", 27));
        a.add(new Student(105, "Jay", 21));

        Collections.sort(a);
        for(Student st:a){
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
    static class Student implements Comparable<Student>{
        int rollno;
        String name;
        int age;
        Student(int rollno, String name, int age){
            this.age = age;
            this.name = name;
            this.rollno = rollno;
        }
        public int compareTo(Student st){
            if(age==st.age){
                return 0;
            }
            else if(age>st.age){
                return 1;
            }
            else{
                return -1;
            }
        }
    }   
}
