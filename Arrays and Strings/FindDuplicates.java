import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class FindDuplicates {

    public static void main(String args[]){
        int arr[]={1,1};
        ArrayList<Integer> ans=findDuplicates(arr);
        for(int i=0;i < ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }

    static ArrayList<Integer> findDuplicates(int arr[]){
        int i=0;
        while(i < arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int index=0;index<arr.length;index++){
                if(arr[index] != index+1)
                    ans.add(arr[index]);
               
            
            }
            return ans;
        
    }
    static void swap(int arr[],int correct,int i){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }
}
