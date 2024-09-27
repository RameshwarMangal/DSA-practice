import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={30,10,-1,4,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++ ){
            int last=arr.length-i-1;
            int maxIndex=findMaxIndex(arr,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int arr[],int maxIndex,int last){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }
    static int findMaxIndex(int arr[],int last){
            int max=0;
            for(int i=0;i<=last;i++){
                if(arr[max]<arr[i])
                    max=i;
            }
            return max;
        }
    
}
