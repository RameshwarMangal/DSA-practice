//https://leetcode.com/problems/move-zeroes/description/
import java.util.Arrays;
class MoveZeros {
    public static void main(String args[]){
	int arr[]={1,0,1};
	System.out.println(Arrays.toString((moveZeroes(arr))));
      
	}


	
        

        public static int[] moveZeroes(int[] nums) {
            int j=-1;
            for(int i=0;i < nums.length ; i++){
                if(nums[i]==0){
                    j=i;
                    break;
                }
            }
            if(j==-1){
                return nums;
            }
            for(int i=j+1; i < nums.length ;i++){
    
                if( nums[i] != 0 ){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    j++;	
                }
            }	
            return nums;
        }
    }
