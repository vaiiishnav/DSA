<<<<<<< HEAD
package Sorting;

public class BubbleSort {
	public static void sort(int[]arr) {
		for(int i=(arr.length)-1;i>=0;i--) {
			
			for(int j=0;i<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]arr= {3,5,34,21,87,3};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
=======
package Sorting;

public class BubbleSort {
	public static void sort(int[]arr) {
		for(int i=(arr.length)-1;i>=0;i--) {
			
			for(int j=0;i<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]arr= {3,5,34,21,87,3};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
