public class bit_manipulation {
    //odd or even
    public static void oddorEven(int num){
        int bitmask=1;
        if((num & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
    // Get ith bit
    public static void getithBit(int num, int i){
        int bitmask=1<<i;
        System.out.println(num & bitmask);
    }
    // Set ith bit
    public static void setithBit(int num, int i){
        int bitmask=1<<i;
        System.out.println(num | bitmask);
    }
    // clear ith bit
    public static int clearithBit(int num, int i){
        int bitmask=~(1<<i);
        return(num & bitmask);
    }
    // update ith bit
    public static void updateithBit(int num, int i, int newbit){
        int num1= clearithBit(num, i);
        int bitmask= newbit<<i;
        System.out.println(num1 | bitmask);
    }
    // clear last i bits
    public static void clearlastiBits(int num, int i){
        int bitmask=((~0)<<i);
        System.out.println(num & bitmask);
    }
    // clear range of bits
    public static void clearrangeofBits(int num, int i, int j){
        int a= ((~0)<<j+1);
        int b= (1<<i)-1;
        int bitmask= a | b;
        System.out.println(num & bitmask);
    }
    // check number is power of 2 or not
    public static void powerof2orNot(int num){
        if((num & (num-1))==0){
            System.out.println("yes the number is power of 2");
        }
        else{
            System.out.println("No the number is not power of 2");
        }
    }
    // fast exponentiation( O(logn))
    public static void fastExponentiation(int a, int n){
        int ans=1;
        while(n>0){
            if((n & 1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    // swap two numbers without using third variable(assignment Q2)
    public static void swap(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y; 
        System.out.println(x+" "+y);
    }
    // add 1 to an integer using bit
    public static void add1(int num){
        System.out.println(-(~num));
    }
    // convert uuppercase character to lowercase(Assignment Q4)
    public static void uppertoLower(){
        for(char ch='A' ; ch <='Z'; ch++){
            System.out.print((char)(ch | ' ')+" ");
        }
    }
    // modular exponentiation( O(logn))
    public static void modularExponentiation(int a, int n,int mod){
        int ans=1;
        a%=mod; //because 9^2%6=3 and 3^2%6 is also equal to 3
        while(n>0){
            if((n & 1)!=0){
                ans=(ans*a)%mod;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        // oddorEven(5);
        // oddorEven(6);
        //  getithBit(10,2);
        // setithBit(10, 2);
        // System.out.println(clearithBit(10, 1));
        // updateithBit(10, 2, 1);
        // clearlastiBits(15, 2);
        // clearrangeofBits(10, 2, 4);
        // powerof2orNot(5);
        // fastExponentiation(5, 3);
        // swap(3, 4);
        // add1(4);
        // uppertoLower();
        // modularExponentiation(5, 3, 13);
    }
}
