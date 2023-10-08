package Sorting;

public class QuickSort {
	public static void QuickSort(int[]arr, int low, int high) {
		if(low<high) {
			
			int partition = part_func(arr,low,  high);
			QuickSort(arr,low,partition-1);
			QuickSort(arr,partition+1,high);
		}
		
	}
	public static int part_func(int[]arr,int low, int high) {
		int pivot = arr[low];
		int left = low;
		int right = high;
		while(right>left) {
			while(arr[left]<= pivot&&left<=high-1) {
				left++;
			}
			while(arr[right]>pivot&&right>=low-1) {
				right--;
			}
			if(left<right) {
				int temp = arr[right];
				arr[right]=arr[left];
				arr[left] = temp;
			}
			
		}
		int temp = arr[right];
		arr[right]=arr[low];
		arr[low]=arr[right]; 
		
		return right;
		
	}
	

	public static void main(String[] args) {
		int[]array = {34,56,7,6,1,2,34,56,87,34,21};
		QuickSort(array,0,(array.length)-1);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
