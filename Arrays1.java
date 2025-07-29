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
    //Max subarray sum(approach1- brute force)
    public static void maxsubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+= arr[k];
                }
                maxSum=Math.max(maxSum,currsum);
                
            }
            
        }
        System.out.println("Max Sum is: "+ maxSum);
    }
    //Max subarray sum(approach2 - prefix sum array)
    public static void maxsubarraySum2(int arr[]){
        int maxSum= Integer.MIN_VALUE;
        int prefixSum[]=new int[arr.length];
        prefixSum[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]= arr[i]+prefixSum[i-1];
        }
        for(int i=0;i<arr.length;i++){
            int currsum=0;
            for(int j=i;j<arr.length;j++){
                currsum= i==0 ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
            }
            maxSum=Math.max(currsum, maxSum);
        }
        System.out.println("Max sum is: "+ maxSum);
    }
    //Max subarray sum (approach 3- kadane;s approach)
    public static void maxsubarraySum3(int arr[]){
        // if all negative in array
        int maxSum= Integer.MIN_VALUE;
        int maxSum1= Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
                maxSum= Math.max(maxSum, arr[i]);
            }
        }
        if(count == arr.length){
            System.out.println("Max Sum is:"+ maxSum);
            return;
        }
        //Normal approach
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxSum1= Math.max(currsum,maxSum1);
        }
        System.out.println("Max Sum is :"+ maxSum1);

    }
    // Trapping rainwater
    public static void trappedrainWater(int arr[]){
        //left max array
        int leftMax[]= new int[arr.length];
        leftMax[0]= arr[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        int rightMax[]= new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=rightMax.length-2;i>=0;i--){
            rightMax[i]= Math.max(arr[i],rightMax[i+1]);
        }
        int trappedrainWater=0;
        int waterLevel=0;
        for(int i=0;i<arr.length;i++){
            waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedrainWater+= (waterLevel - arr[i]);
        }
        System.out.println("Trapped rainwater is: "+ trappedrainWater);
    }
    //buy and sell stock
    public static void buyandSell(int arr[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice < arr[i]){
                int profit= arr[i]-buyPrice;
                maxProfit=Math.max(profit, maxProfit);
            }
            else{
               buyPrice= arr[i]; 
            }
        }
        System.out.println("Max profit is: "+ maxProfit);
    }
    // find duplicate
    public static boolean findDuplicate(int nums[]) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        } 
        return false;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4};
        // int arr[]={7,1,5,3,6,4};
        // int arr[]={-11,-2,-6,-1,-3};
        // int arr[] = {4,5,7,8,10};
        // linearSearch(arr, 7);
        // largestNumber(arr);
        // binarySearch(arr, 10);
        // reverse(arr);
        // pairs(arr);
        // subarrays(arr);
        // maxsubarraySum3(arr);
        // trappedrainWater(arr);
        // buyandSell(arr);
        System.out.println(findDuplicate(nums));
    }
}

   
