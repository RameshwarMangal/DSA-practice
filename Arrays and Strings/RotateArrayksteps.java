// https://leetcode.com/problems/rotate-array/

import java.util.Arrays;
public class RotateArrayksteps {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    public static int[] rotate(int[] nums, int k) {
        if(nums.length == 0) return nums;
        k = k % nums.length; // handle cases where k is greater than nums.length
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = nums[nums.length - k + i];
        }
        for(int i = nums.length - 1; i >= k; i--){
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++){
            nums[i] = arr[i];
        }
        return nums;
    }
}
