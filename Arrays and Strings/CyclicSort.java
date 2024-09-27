import java.util.Arrays;

public class CyclicSort {


    public static void main(String args[]){
        int arr[]={1,2,5,4,6,3,0};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));


        
    }   
    static void cyclic(int arr[]){

        
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[correct] != arr[i])
                swap(arr,correct,i);
            else
                i++;
        }
    }
    static void swap(int arr[],int correct,int i){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }
}
