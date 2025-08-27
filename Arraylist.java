import java.util.*;
public class Arraylist {
    // container with most water(Brute Force O(n^2))
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht= Math.min(height.get(i),height.get(j));
                int width= j-i;
                int currWater= ht*width;
                maxWater= Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    // container with most water(Two Pointer Approach O(n))
    public static int storeWater1(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht= Math.min(height.get(lp),height.get(rp));
            int width= rp-lp;
            int currWater= ht*width;
            maxWater= Math.max(maxWater,currWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        
        return maxWater;
    }
    // Pair Sum-1(Two pointer Approach O(n)) // list is sorted in this case
    public static boolean pairSum1(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    // Pair sum -2 (//Two Pointer approach O(n))// list is soted and rotated
    public static boolean pairSum2(ArrayList<Integer>list, int target){
        int n= list.size();
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        
        }
        return false;
    }
    public static void main(String args[]){
        // ArrayList<Integer>height=new ArrayList<>() ;
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // // System.out.println(storeWater(height));
        // System.out.println(storeWater1(height));
        // ArrayList<Integer>list= new ArrayList<>();
        // for(int i=1;i<=6;i++){
        //     list.add(i);
        // }
        // int target=5;
        // System.out.println(pairSum1(list, target));
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list, target));
    }
}
