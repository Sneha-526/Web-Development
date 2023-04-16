package JAVA.Function_And_Array;
public class for_each_loop {
    public static void main(String[] args) {
        int []arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        //for-each loop...
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
