<<<<<<< HEAD
package Recursion;

public class PrintNto1 {
	public static void recurFunc(int i, int n, int[]ans) {
		if(n==0) {
			return;
		}
		ans[i]=n;
		recurFunc(i+1,n-1,ans);
	}
	public static void main(String[] args) {
		int[]ans= new int[5];
		recurFunc(0,5,ans);
		for(int j=0;j<5;j++) {
			System.out.println(ans[j]);
		}

	}

}
=======
package Recursion;

public class PrintNto1 {
	public static void recurFunc(int i, int n, int[]ans) {
		if(n==0) {
			return;
		}
		ans[i]=n;
		recurFunc(i+1,n-1,ans);
	}
	public static void main(String[] args) {
		int[]ans= new int[5];
		recurFunc(0,5,ans);
		for(int j=0;j<5;j++) {
			System.out.println(ans[j]);
		}

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
