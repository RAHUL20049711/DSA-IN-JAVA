public class Divideconquer {
    public static void printarr(String arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    // merge sort
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int newarr[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                newarr[k]=arr[i];
                i++;
            }else{
                newarr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            newarr[k++]=arr[i++];
        }
        while(j<=ei){
            newarr[k++]=arr[j++];
        }
        for(k=0,i=si;k<newarr.length;k++,i++){
            arr[i]=newarr[k];
        }
    }
    // Quick Sort
    public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx= partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    // search in a rotated sorted array(T.C should be O(nlogn))
    public static int search(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>= arr[si]){
            if(arr[si]<=key && key<=arr[mid]){
                return search(arr, key, si, mid-1);
            }
            else{
                return search(arr, key, mid+1, ei);
            }
        }
        else{
            if(arr[ei]>=key && arr[mid]<=key){
                return search(arr, key, mid+1, ei);
            }
            else{
                return search(arr, key, si, mid-1);
            }
        }
    }
    // merge sort to array of strings
    public static void mergeSortString(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSortString(arr, si, mid);
        mergeSortString(arr, mid+1, ei);
        mergeString(arr,si,ei,mid);
    }
    public static void mergeString(String arr[],int si,int ei,int mid){
        String newarr[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
    
            if(arr[i].compareTo(arr[j])<0){
                newarr[k]=arr[i];
                i++;
            }else{
                newarr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            newarr[k++]=arr[i++];
        }
        while(j<=ei){
            newarr[k++]=arr[j++];
        }
        for(k=0,i=si;k<newarr.length;k++,i++){
            arr[i]=newarr[k];
        }
    }
    // Inversion count in the array(assignment Q3 O(nlogn)// Important
    public static int mergeSortInv(int arr[],int si,int ei){
        if(si<ei){
            
        int mid=si+(ei-si)/2;
        int leftInvCount=mergeSortInv(arr, si, mid);
        int rightInvCount=mergeSortInv(arr, mid+1, ei);
        int InvCount= mergeInv(arr,si,ei,mid);
        return leftInvCount+rightInvCount+InvCount;
    }
    return 0;
}
    public static int mergeInv(int arr[],int si,int ei,int mid){
        int newarr[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int InvCount=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                newarr[k]=arr[i];
                i++;
            }else{
                newarr[k]=arr[j];
                j++;
                InvCount+=mid-i+1;
            }
            k++;
        }
        while(i<=mid){
            newarr[k++]=arr[i++];
        }
        while(j<=ei){
            newarr[k++]=arr[j++];
        }
        for(k=0,i=si;k<newarr.length;k++,i++){
            arr[i]=newarr[k];
        }
        return InvCount;
    }

    public static void main(String args[]){
        // int arr[]={2,4,8,1,9};
        // // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // printarr(arr);
        // int arr[]={4,5,6,7,0,1,2};
        // int key=0;
        // int taridx=search(arr, key, 0, arr.length-1);
        // System.out.println(taridx);
        // String arr[]={"sun","earth","mars","mercury"};
        // mergeSortString(arr, 0, arr.length-1);
        // printarr(arr);
        int arr[]={2,4,1,3,5};
        System.out.println(mergeSortInv(arr,0,arr.length-1));
    }
}
