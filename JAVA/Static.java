package JAVA;

public class Static {

    static class BankAccount{
        int anum;
        int money;
        static int roi;
        void announce(){
            System.out.println(this.anum + ", " + this.money + ", " + roi);
        }
        static void decreaseROI(){
            //anum and money can't be used in this method.
            roi--;
            //announce --> Not Allowed.
            BankAccount a = new BankAccount();
            a.announce();   //This is Allowed.
        }
    }
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.anum = 10;
        a1.money= 100;
        BankAccount.roi = 4;
        a1.announce();

        BankAccount a2 = new BankAccount();
        a2.anum = 11;
        a2.money = 110;
        BankAccount.roi = 5;
        a2.announce();
        a1.announce();
    }
}
