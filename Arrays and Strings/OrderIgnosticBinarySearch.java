public class OrderIgnosticBinarySearch {



    public static void main(String args[]){
        int arr[]={50,21,19,15,14,12,5,4};
        int target=51;
        System.out.println(orderignosticBinarySearch(arr,target));
    }


    static int orderignosticBinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target)
                return mid;


            if(isAsc){
                if(arr[mid] > target)
                    end=mid-1;
                else 
                    start=mid+1;
            }
            else{
                if(arr[mid] > target)
                    start=mid + 1;
                else 
                    end=mid-1;
            }            
    }
        return -1;
}
}
