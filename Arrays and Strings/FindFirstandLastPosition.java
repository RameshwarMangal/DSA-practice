//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class FindFirstandLastPosition {
    public static void main(String args[]){
        int arr[]={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
	}
	public static int[] searchRange(int nums[],int target){

	int ans[]={-1,-1};
	ans[0]=search(nums,target,true);
    if(ans[0] != -1)
        ans[1]=search(nums,target,false);
	
	return ans;		

	}
	public static int search(int nums[],int target,boolean leftElement){
        int start=0;
	    int ans=-1;
        int end=nums.length-1;
        while(start <= end){
           int mid=start+(end-start)/2;
           if(nums[mid] > target)
            	end=mid-1;
            else if(nums[mid] < target)
                start=mid+1;
            else{
                //potential ans
		        ans=mid;
		        if(leftElement)
			        end= mid -1;
		        else
			        start = mid + 1;
		        }
                
        }
        return ans;
    }

}
