import java.util.*;
public class Strings {
    // Palindrome or not
    public static boolean Palindrome(String str){
        int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    // Shortest path
    public static void shortestPath(String dir){
        int n= dir.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            char ch= dir.charAt(i);
            //South
            if(ch=='S'){
                y--;
            }
            //West
            else if(ch=='W'){
                x--;
            }
            //East
            else if (ch=='E') {
                x++;
            }
            else{
                y++;
            }
        }
        int x2= x*x;
        int y2=y*y;
        float ans= (float)Math.sqrt(x2+y2);
        System.out.println("Shortest path is:"+ ans);
    }
    // Largest String( compare in lexicographical order)
    public static void largestString(String fruits[]){
        String largest= fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    // capitalize first leter(using String builder) // Important
    public static void capitalizefirstLetter(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if((str.charAt(i)==' ') && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    // Compress String(// Important)
    public static void compressString(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            Integer count=1;
            while( i< str.length()-1 && str.charAt(i)==str.charAt(i+1)  ){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
    // count lowercase voewls in String(assignment Q1)
    public static void lowercaseVowels(String str){
        int n= str.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch= str.charAt(i);
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        // String str="I am Rahul";
        // String str="aaabbccddd";
        // String str="hi, i am rahul";
        // String fruits[]={"apple","mango","banana"};
        // String dir= "WNEENESENNN";
        // String str= "noom";
        // System.out.println(Palindrome(str));
        // shortestPath(dir);
        // largestString(fruits);
        // capitalizefirstLetter(str);
        // compressString(str);
        // lowercaseVowels(str);
        //Assignment Q3
        // String str= "ApnaCollege";
        // str=str.replace("l", "");
        // System.out.println(str);
    }
}
