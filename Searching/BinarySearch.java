package Searching;
public class BinarySearch {
    public static int search(int[] arr,int low, int high, int key){
    if(low==high){
        if(arr[low]==key){
            return low;
        }
        else{
            return -1;
        }
    } 
        else{
            int mid = (low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                return search(arr,low,mid-1,key);
            }
            else{
                return search(arr,mid+1,high,key);
            }
        }
    

    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5,67,78,79,90};
        System.out.println(search(arr, 0, (arr.length)-1, 90));
    }
}

