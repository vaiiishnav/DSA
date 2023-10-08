<<<<<<< HEAD
package Recursion;
import java.util.*;
public class printNtimes {
	public static void recurfunc(int i,int n) {
		if(i>n) {        //parameter manipulation, the parameters are increased/decreased until
							//base condition is met
			return;
		}
		System.out.println(i);
		recurfunc(i+1,n);
		
	}
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recurfunc(1,n);

	}

}
=======
package Recursion;
import java.util.*;
public class printNtimes {
	public static void recurfunc(int i,int n) {
		if(i>n) {        //parameter manipulation, the parameters are increased/decreased until
							//base condition is met
			return;
		}
		System.out.println(i);
		recurfunc(i+1,n);
		
	}
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recurfunc(1,n);

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
