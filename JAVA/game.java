package JAVA;
import java.util.Random;
import java.util.Scanner;
class Guess{
    int number;
    int inputNumber;
    int noOfGusses;
    public int getNoOfGuess(){
        return noOfGusses;
    }
    public void setNoOfGusses(int gusses){
        noOfGusses = gusses;
    }
    public Guess(){
        Random ran = new Random();
        number = ran.nextInt(100);
    }
    void userInput(){
        System.out.println("Guess the number:");
        Scanner scn = new Scanner(System.in);
        inputNumber = scn.nextInt();
        scn.close();
    }
    boolean isCorrectNo(){
        if(inputNumber == number){
            return true;

        }
        else if(inputNumber<number){
            System.out.println("Too Less...");

        }
        else if(inputNumber>number){
            System.out.println("Too High");
        }
        return false;
    }
}

public class game {
    public static void main(String[] args) {
        Guess g = new Guess();
        boolean b = false;
        while(!b){
        g.userInput();
        b = g.isCorrectNo();
        System.out.println(b);
        }
    }
}
