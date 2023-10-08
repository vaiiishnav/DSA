<<<<<<< HEAD
package Recursion;

public class FactorialofFirstN {
	public static void Fact(int n, int factorial) {
	
		if(n<1) {
			System.out.println(factorial); //param recursion
											
			return;
		}
		Fact(n-1,factorial*n);
	}
	public static void main(String[] args) {
			Fact(5,1);
			

	}

}
=======
package Recursion;

public class FactorialofFirstN {
	public static void Fact(int n, int factorial) {
	
		if(n<1) {
			System.out.println(factorial); //param recursion
											
			return;
		}
		Fact(n-1,factorial*n);
	}
	public static void main(String[] args) {
			Fact(5,1);
			

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
