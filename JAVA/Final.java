package JAVA;

public class Final {
	static class P{
		final int maxScore;
		P(){
			maxScore = 100;//
		}
		final void fun(){
			final int age = 10;
			//age++; --> Compile time error.
			System.out.println("MaxScore = " + maxScore);
			System.out.println("Age = " + age);
		}
		void fun(int x){
			System.out.println("Overloading is allowed in final function but overriding not");
		}
		//maxScore++; --> gives compile time error.

	}
	static class C extends P{
		/*
		This finction cannot be overriden because class P has same function with keyword final.
		void fun(){
			System.out.println("C fun");
		}
		*/
	}

    public static void main(String[] args) {
        P obj = new P();
		obj.fun();
    }
}
