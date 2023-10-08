<<<<<<< HEAD
package Hashing;
import java.util.*;

public class CountElemOfArray {
		

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter element: ");
			int x = sc.nextInt();
			arr[i]=x;
		}
		//pre compute
		int [] hash = new int[13]; //change size of array to the max value as givenin question
		for(int j=0;j<n;j++) {
			hash[arr[j]] +=	1;				//rather we use the int value of arr to precompute hash array
		}
		int q;
		System.out.println("Enter number whose frequency is to be found");
		q = sc.nextInt();
		System.out.println(hash[q]);

	}
	
}
=======
package Hashing;
import java.util.*;

public class CountElemOfArray {
		

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter element: ");
			int x = sc.nextInt();
			arr[i]=x;
		}
		//pre compute
		int [] hash = new int[13]; //change size of array to the max value as givenin question
		for(int j=0;j<n;j++) {
			hash[arr[j]] +=	1;				//rather we use the int value of arr to precompute hash array
		}
		int q;
		System.out.println("Enter number whose frequency is to be found");
		q = sc.nextInt();
		System.out.println(hash[q]);

	}
	
}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
