
import java.util.Arrays;
public class MissingandDouble {
    
    public static void main(String args[]){
        int arr[]={2,2};
        System.out.println(Arrays.toString(doubleElement(arr)));
    }
    static int[] doubleElement(int arr[]){

        
        int i=0;
         while(i<arr.length){
             int correct=arr[i] - 1;
             if(arr[correct] != arr[i])
                 swap(arr,correct,i);
             else
                 i++;
         }
         System.out.println(Arrays.toString(arr));
         

         for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1)
                return new int []{arr[index],index+1};
         }
         return new int[]{-1,-1};
     }
     static void swap(int arr[],int correct,int i){
         int temp=arr[correct];
         arr[correct]=arr[i];
         arr[i]=temp;
     }
 }

