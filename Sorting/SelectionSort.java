<<<<<<< HEAD
package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[]arr = {4,3,5,2};
		int len = arr.length;
		for(int i=0;i<=len-2;i++) {
			for(int j=i;j<=len-1;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int k=0;k<len;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
=======
package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[]arr = {4,3,5,2};
		int len = arr.length;
		for(int i=0;i<=len-2;i++) {
			for(int j=i;j<=len-1;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int k=0;k<len;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
