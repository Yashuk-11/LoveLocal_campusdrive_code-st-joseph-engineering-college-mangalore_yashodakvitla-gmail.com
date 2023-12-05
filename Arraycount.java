//Given an integer array of size n, find all elements that appear more than  n/3  times.

import java.util.*;
import java.util.Scanner;
public class Arraycount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();								//read array size
	    ArrayList<Integer> a =new ArrayList<>();		//creating a array list
	    for (int i = 0; i< n; i++) {
	    	a.add(sc.nextInt());						//read input
	    }

	    Collections.sort(a);							//sort array in ascending order
	    int b=a.size()/3;								//find the condition or limit
	    int i=0;
        while(i<n) {
        	int cnt=Collections.frequency(a, a.get(i));  //finding frequency of each value in array
	        if(cnt>b) {
	        	System.out.print(a.get(i)+" ");         //print the value if number occurs more than the limit or condition
	        }
	        i=i+cnt;            						//increment the index for the next value
	   }
	}
}

