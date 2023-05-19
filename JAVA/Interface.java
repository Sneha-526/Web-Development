package JAVA;
public class Interface {
    public static void main(String[] args) {
        ISample o1 = new CSample();
        ISample o2 = new CSample();
        o1.fun();
        o2.fun();
        System.out.println(ISample.d);
    }
    static interface ISample{
        int d = 10;
        void fun();
    }
    static class CSample implements ISample{
        public void fun(){
            System.out.println("Hello.");
        }
    }
}
