public class FindMin {
    public static void main(String[] args) {
        int [] nums={9,3,5,-2,6,2};
        int ans=findMin(nums);
        System.out.println(ans);
    }
    static int findMin(int arr[]){
        int min=arr[0];
        for(int i =1;i < arr.length ; i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
