package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void mS(int[]arr, int low,int high){
        int mid =(low+high)/2;
        if(low==high){
            return;
        }
        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[]arr,int low, int mid, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid&&right<=high){
             if(arr[left]<=arr[right]){
            ans.add(arr[left]);
            left++;
        }
        else{
            ans.add(arr[right]);
            right++;
        }
        }
        while(left<=mid){
            ans.add(arr[left]);
            left++;
        }
        while(right<=high){
            ans.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=ans.get(i-low);
        }

    }
     public static void main(String[] args) {
        int [] array = {98,76,44,1,6,4,5,2,1};
        mS(array, 0, (array.length)-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }
    
    }
   

