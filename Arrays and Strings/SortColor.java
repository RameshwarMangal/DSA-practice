//https://leetcode.com/problems/sort-colors/
public class SortColor {
    class Solution {
        public void sortColors(int[] nums) {
            int low=0,mid=0,high=nums.length-1;
            if(nums.length == 1)
                return;
            while(mid <= high ){
                if(nums[mid] == 0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                else if(nums[mid]==1)
                    mid++;
                else{
                    swap(nums,mid,high);
                    high--;
                }
        
            }
        
        }
        
        static void swap(int arr[],int val1,int val2){
            int temp=arr[val1];
            arr[val1]=arr[val2];
            arr[val2]=temp;
    
        }
    }
}
