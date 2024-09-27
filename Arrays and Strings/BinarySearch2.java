public class BinarySearch2 {
    public static void main(String args[]){
        int arr[]={5,10,15,17,19,21,50};
        int target=11;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            //mid=start+end/2        Might be possible that(start+end) exceeds the range of Integer in java
           int mid=start+(end-start)/2;
           if(arr[mid] == target)
            return mid;
            else if(target > arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}