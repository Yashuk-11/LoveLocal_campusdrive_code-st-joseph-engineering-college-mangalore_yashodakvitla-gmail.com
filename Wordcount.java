//Given an integer numRows, return the first numRows of Pascal's triangle.

import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);     
        int n=sc.nextInt();               					//read n value
        
        int[][] a=new int[n][n];							//Initialize 2D array to store value
        for(int line=0;line<n;line++) {						//for each line 
        	for(int i=0;i<=line;i++) {						//in each line, number of elements should be equal to line number
        		if(line==i||i==0) {							//for first and last element 
        			a[line][i]=1;
        		}
        		else {
        			a[line][i]=a[line-1][i-1]+a[line-1][i];   //current value=left of above of current + value of above of current 
        		}
        		System.out.print(a[line][i]+" ");				//print the result
        	}
        	System.out.println();								//to start from new line
        }
        
        	
        
    }
}
