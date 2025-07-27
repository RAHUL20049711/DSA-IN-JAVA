public class Arrays1 {
    //Linear search
    public static void linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    //Largest Number
    public static void largestNumber(int arr[]){
        int Largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>Largest){
                Largest= arr[i];
            }
        }
        System.out.println(Largest);
    }
    //Binary Search
    public static void binarySearch(int arr[], int key){
        int start=0;
        int end= arr.length-1;
        while(start <= end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] > key){
                end= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        System.out.println(-1);
    }
    //reverse an array
    public static void reverse(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Pairs in an array
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+","+arr[j]);
            }
            System.out.println();
        }
    }
    // print subarrays
    public static void subarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {4,5,7,8,10};
        // linearSearch(arr, 7);
        // largestNumber(arr);
        // binarySearch(arr, 10);
        // reverse(arr);
        // pairs(arr);
        // subarrays(arr);
    }
}

   
