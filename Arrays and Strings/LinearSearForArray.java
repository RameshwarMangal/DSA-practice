public class LinearSearForArray {
    public static void main(String args[]){
        int[] nums={23,10,16,17,50,45,33};
        int target=12;
        boolean ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static boolean linearSearch(int arr[],int target){
        if(arr.length==0)
            return false;
    //run a for loop
        /*for(int index=0; index < arr.length; index++){
            //check for element at every index if it is == target
            if(arr[index] == target)
                return index;
        }*/
        //Using Enhanced For Loop
        for(int element : arr){
            if(element == target)
                return true;
        }
        return false;//If none of the above lines execute,this line will execute
    }
}