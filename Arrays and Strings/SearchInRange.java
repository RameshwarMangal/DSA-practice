public class SearchInRange {
    public static void main(String args[]){
        int[] nums={23,10,16,17,50,45,33};
        int target=50;
        int ans=linearSearch(nums,target,1,4);
        System.out.println(ans);
    }
    static int linearSearch(int arr[],int target,int start,int end){
        if(arr.length==0)
            return -1;
    //run a for loop
        for(int index=start; index <= end; index++){
            //check for element at every index if it is == target
            if(arr[index] == target)
                return index;
         }
        
        return -1;//If none of the above lines execute,this line will execute
    }
}
