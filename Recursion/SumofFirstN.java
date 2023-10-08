<<<<<<< HEAD
package Recursion;

public class SumofFirstN {
	
	public static int recurFunc(int i) {
		if(i==0) {
			return 1;
						//func recuriosn, the return value takes og value, goes on decreasing until base condition
							//is met, then it backtracks ands exectues the fun in stack memory
							//i goes on decreasing from 5, to 4, to 3 etc, once it hits 0, 0 value is returned
								//and 1+2+3+4+5 happens, n and n-1
		}
		return i*recurFunc(i-1);
	}
	public static void main(String[] args) {
		System.out.println(recurFunc(3));

	}

}
=======
package Recursion;

public class SumofFirstN {
	
	public static int recurFunc(int i) {
		if(i==0) {
			return 1;
						//func recuriosn, the return value takes og value, goes on decreasing until base condition
							//is met, then it backtracks ands exectues the fun in stack memory
							//i goes on decreasing from 5, to 4, to 3 etc, once it hits 0, 0 value is returned
								//and 1+2+3+4+5 happens, n and n-1
		}
		return i*recurFunc(i-1);
	}
	public static void main(String[] args) {
		System.out.println(recurFunc(3));

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
