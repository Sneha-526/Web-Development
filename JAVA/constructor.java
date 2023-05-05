package JAVA;
class Main{
    private int id;
    private String name;

    public Main(){
        id = 0;
        name = "Your-Name";
    }
    public Main(String n, int i){
        id = i;
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

public class constructor {
    public static void main(String[] args) {
        Main a = new Main();
        Main b = new Main("sneha", 12);
        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(b.getName());
        System.out.println(b.getId());

    } 

}
