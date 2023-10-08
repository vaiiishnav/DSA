<<<<<<< HEAD
package Sorting;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		int[]nums= {3,3};
		int target =6;
		int first_ptr = 0;
        int second_ptr = 1;
        int[]ans= new int[2];
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(((nums[i])+(nums[j]))==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                    
                }
            }

        }
        for(int i =0;i<2;i++) {
        	System.out.println(ans[i]);
        }
		
		
		
	}

}
=======
package Sorting;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		
		int[]arr1 = {1,2,3,4,5,0,0,0,0,0};
		int m = arr1.length;
		int[]arr2 = {11,12,12,13,14};
		int n = arr2.length;
		 int x = m+n;
	        for(int i=m;i<=x-1;i++){
	            int p = 0;
	        	int k = arr2[p];
	            arr1[i]=k;
	            p++;
	           
	        }
	        for(int i=0;i<x;i++) {
	        	System.out.println(arr1[i]);        }
	        
		
	}

}
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
