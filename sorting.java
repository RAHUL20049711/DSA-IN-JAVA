import java.util.*;

public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // Bubble Sort
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    // Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp= arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    // Insertion Sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    // Counting Sort
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        // Arrays.sort(arr,0,3); // use Integer 
        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr);
    }
}
