public class Recursion {
    // Print n to 1(Descending order)
    public static void printDec(int n){
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        // kaam
        System.out.print(n+" ");
        printDec(n-1);
    }
    // print 1 to n(Increasing order)
    public static void printInc(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // factorial of number n
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    // print sum of first n naturla numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    // Print nth fibonacci number
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    // check if array is sorted or not
    public static boolean isarraySorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isarraySorted(arr, i+1);
    }
    // WAF to find first occurence of element in array
    public static int firstOccurence(int arr[], int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    // WAF to find last occurence of element in array
    public static int lastOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int lastidx=lastOccurence(arr, i+1, key);
        if(lastidx==-1 && arr[i]==key){
            return i;
        }
        return lastidx;
    }
    // Print x^n
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x * pow(x, n-1);
    }
    // Print x^n(OPTIMIXED- O(logn))
    public static int optimizedpow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower= optimizedpow(x, n/2);
        int power= halfpower* halfpower;
        if(n%2 != 0){
            return x * power;
        }
        return power;

    }
    // Tiling Problem
    public static int tilingProblem(int n){ // floor is 2*n and tile is 2*1
        if(n==0 || n==1){
            return 1;
        }
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    // Remove duplicates in a String
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean arr[]){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char ch= str.charAt(idx);
        if(arr[ch-'a']== true){
            removeDuplicates(str, idx+1, sb, arr);
        }
        else{
            arr[ch-'a']= true;
            removeDuplicates(str, idx+1, sb.append(ch), arr);
        }
        
    }
    // Friends Pairing Problem
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    // Binary Strings Problem
    public static void printbinaryStrings(int n,int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printbinaryStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            printbinaryStrings(n-1, 1, str+"1");
        }
    } 
    // find all indices of key in given array(assignment Q1)
    public static void allIndices(int arr[],int i,int key){
        if(i == arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allIndices(arr, i+1, key);
    }   
    // convert number into string(assignment Q2)
    static String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","eight","nine"};
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    // length of string using recursion(assignment Q3)
    public static int stringLength(String str){
        if(str.length()==0){
            return 0;
        }
        return stringLength(str.substring(1))+1;
    }
    // count all contigous substrings start and end with same character(assignment Q4)
    public static int countSubstrings(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=countSubstrings(str, i, j-1, n-1)+countSubstrings(str, i+1, j, n-1)-countSubstrings(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    // Tower of Hanoi(very important O(2^n))(Assignment Q5)
    public static void towerofHanoi(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("transfer disk" + n +"from"+ src+ "to"+ dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk"+ n +"from"+ src+ "to"+ dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        // printDec(5);
        // printInc(5);
        // System.out.println(factorial(4));
        // System.out.println(sum(6));
        // System.out.println(fibonacci(6));
        // int arr[]={1,2,3,4,5};
        // System.out.println(isarraySorted(arr, 0));
        // int arr[]={1,2,5,6,7,5,8};
        // System.out.println(firstOccurence(arr, 0, 5));
        // int arr[]={1,2,5,6,7,5,8};
        // System.out.println(lastOccurence(arr, 0, 5));
        // System.out.println(pow(2, 10));
        // System.out.println(optimizedpow(2, 10));
        // System.out.println(tilingProblem(3));
        // String str="appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        // printbinaryStrings(3, 0, "");
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // allIndices(arr, 0, 2);
        // printDigits(2019);
        // String str= "abcde";
        // System.out.println(stringLength(str));
        // String str="aba";
        // int n=str.length();
        // System.out.println(countSubstrings(str, 0, n-1, n));
        // int n=2;
        // towerofHanoi(n, "S", "H", "D");
    }
}