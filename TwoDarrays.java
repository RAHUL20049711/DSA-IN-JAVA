import java.util.*;

public class TwoDarrays {
    // largest and smallest in array
    public static void largestandsmallest(int arr[][],int n,int m){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0 ; i<n; i++){
            for(int j=0 ; j<m; j++){
                largest=Math.max(largest,arr[i][j]);
                smallest=Math.min(smallest,arr[i][j]);
            }
        }
        System.out.println("The largest element is:"+ largest);
        System.out.println("The smallest element is:"+ smallest);
    }
    // Spiral matrix
    public static void sprialMatrix(int arr[][],int n,int m){
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=m-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow== endRow){
                    return;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startCol+1;i--){
                if(startCol==endCol){
                    return;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }
    }
    // Diagonal sum(optimized approach- O(n))
    public static void diagonalSum(int arr[][],int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            if(i!=n-i-1){
                sum+=arr[i][n-i-1];
            }
        }
        System.out.println("Diagonal Sum is:"+ sum);
    }
    // search in sorted matrix(Optimzed approach- O(m+n))// staircase approach
    public static void searchinsortedMatrix(int arr1[][],int key){
        int n= arr1.length;
        int m=arr1[0].length;
        int row= n-1;
        int col= 0;
        while(row>=0 && col<=m-1){
            if(arr1[row][col]==key){
                System.out.println("("+row+","+col+")");
                return;
            }
            else if(arr1[row][col]>key){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("not found");
    }
    // number of 7's in array(assigment Q1)
    public static void seveninArray(int arr2[][]){
        int number=7;
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                if(arr2[i][j]==number){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    // sum of numbers in second row(assignment Q2)
    public static void sumofsecondRow(int arr3[][]){
        int sum=0;
        int i=1; //as only need to traverse in second row
        for(int j=0;j<arr3[0].length;j++){
            sum+=arr3[i][j];
        }
        System.out.println(sum);
    }
    // Transpose of a matrix(assignment Q3)
    public static void transpose(int arr3[][]){
        int n= arr3.length;
        int m=arr3[0].length;
        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=arr3[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        // int arr3[][]={{1,4,9},{11,4,3},{2,2,3}};
        // int arr2[][]={{4,7,8},{8,8,7}};
        // int arr1[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // int arr[][] = {{1,2,3,4},{10,11,2,13},{14,15,16,17},{5,6,7,8}};
        // int n= arr.length;
        // int m=arr[0].length;
        // int key=34;
        // largestandsmallest(arr,n,m);
        // sprialMatrix(arr, n, m);
        // diagonalSum(arr, n, m);
        // searchinsortedMatrix(arr1,key );
        // seveninArray(arr2);
        // sumofsecondRow(arr3);
        // transpose(arr3);
    }
}
