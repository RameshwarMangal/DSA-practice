
// User function Template for Java
//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
class PositiveSum {
    // Function for finding maximum and value pair
    public static void main(String args[]){
        int a[]={2, 3, 5, 1, 9};
        long k=10;
        System.out.println(longestSubarrayWithSumK(a, k));
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left=0,right=0;
        int sum=a[0];
        int maxLength=0;
        while(right < a.length){

            while(left <= right && sum > k){

            sum -= a[left];
            left++;

        }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
        right++;

        if(right < a.length)
            sum +=a[right];
        }
        return maxLength;
    }
}
