public class FindCeiling {
    
    public static void main(String args[]){
        int arr[]={2,3,5,9,14,16};
        int target=17;
        System.out.println(findCeiling(arr,target));
    }
    //ceiling means the number equal to the number or next greater
    static int findCeiling(int arr[],int target){
        //if target is great than the hihighest element of the array
        if(target > arr[arr.length-1])
            return -1;
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            //mid=start+end/2        Might be possible that(start+end) exceeds the range of Integer in java
           int mid=start+(end-start)/2;
           if(arr[mid] == target)
            return mid;
            else if(target > arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
        //To find floor we return end
    }
}

