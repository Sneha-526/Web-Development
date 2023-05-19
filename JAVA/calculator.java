package JAVA;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        OperationClass obj = new OperationClass();
        Scanner scn = new Scanner(System.in);
        double userInput1, userInput2;
        int userChoice;
        System.out.print("Enter The First Number: ");
        userInput1 = scn.nextDouble();
        System.out.print("Enter The Second Number: ");
        userInput2 = scn.nextDouble();
        obj.fnum = userInput1;
        obj.snum = userInput2;
        System.out.println("Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = scn.nextInt();

        switch (userChoice){
        case 1:
            obj.add();
            System.out.println();
            break;
        case 2:
            obj.sub();
            break;
        case 3:
            obj.div();
            break;
        case 4:
            obj.mul();
            break;
        }

        scn.close();
    }
}
    class OperationClass{

        double fnum, snum, answer;
    
        public void add(){
            answer = fnum + snum;
            System.out.println(answer);
        }
    
        public void sub(){
            answer = fnum - snum;
            System.out.println(answer);
        }
    
        public void div(){
            answer = fnum / snum;
            System.out.println(answer);
        }
    
        public void mul(){
            answer = fnum * snum;
            System.out.println(answer);
        }
    }