//https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
public class JumpArray {
    public boolean canJump(int[] nums) {
        int maxi =0;
 
 
     for(int i=0;i< nums.length;i++){
         if(i > maxi)
             return false;
         maxi=Math.max(maxi,nums[i]+i);
     
     }
     return true;
  
 
     }
}
