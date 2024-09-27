import java.util.Arrays;
public class LinearSearch2DArray {
    public static void main(String args[]){
        int arr[][]={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int arr1[]=new int[]{1,2,3,45};
        int target=10;
        int [] ans=searchItem(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchItem(int arr[][],int target ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
