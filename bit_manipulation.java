public class bit_manipulation{
    //odd or even
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    //get ith bit
    public static int getithbit(int n, int i){
        int bitmask= 1<<i;
        if ((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    //set ith bit
    public static int setithbit(int n, int i){
        int bitmask= 1<<i;
        return n | bitmask;
    }
    //clear ith bit
    public static int clearithbit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    //update ith bit
    public static int updateithbit(int n, int i,int newbit){
        // method 1
        // if(newbit == 0){
        //     return clearithbit(n, i);
        // }else{
        //     return setithbit(n, i);
        // }
        // method 2
        n = clearithbit(n, i);
        int bitmask= newbit<<i;
        return n | bitmask;
    }
    // clear last i bits
    public static int clearlastibits(int n, int i){
        int bitmask= (~0)<<i;
        return n & bitmask;
    }
    // clear range of bits
    public static int clearibitsinRange(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1 << i)-1;
        int bitmask= a | b;
        return n & bitmask;
    }
    // check if a number is power of 2 or not
    public static boolean isPoweroftwo(int n){
        return (n & (n-1))==0;
    }

    // count Set bits in a number
    public static int countsetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!= 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    // Fast exponentiation
    public static int fastExpo(int a, int n){
        int ans=1;
        while(n > 0){
            if((n & 1)!=0){
                ans= ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    // 
    public static void main(String[]args){
        // oddoreven(88);
        // System.out.println(getithbit(5, 2));
        // System.out.println(setithbit(10,2 ));
        // System.out.println(clearithbit(10, 1));
        // System.out.println(updateithbit(10, 2, 1));
        // System.out.println(clearlastibits(15, 2));
        // System.out.println(clearibitsinRange(10, 2, 4));
        // System.out.println(isPoweroftwo(5));
        // System.out.println(countsetBits(10));
        System.out.println(fastExpo(3, 5));

    }
}