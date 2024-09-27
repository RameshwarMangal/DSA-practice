public class FindMin2DArray {
    public static void main(String args[]){
        int [][] nums={
            {40,30,5},
            {1,800},
            {90,-100,200}
        };
        System.out.println(findMin(nums));
        return;
    }
    static int findMin(int arr[][]){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){// error
                if(min > arr[i][j])
                    min=arr[i][j];
            }
        }
        return min;
    }
}
