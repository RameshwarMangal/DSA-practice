public class Sum2DArray {
    public static void main(String args[]){
        int [][] nums={
            {4,3,5},
            {1,8},
            {9,7,5}
        };
            
            System.out.println(findMinSum(nums));
    }
        static int findMinSum(int arr[][]){
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                int count=0;
                for(int j=0;j<arr[i].length;j++){
                    count=count+arr[i][j];
                }
                
               if(ans < count)
                    ans=count;
            }
            return ans;
        }
}
