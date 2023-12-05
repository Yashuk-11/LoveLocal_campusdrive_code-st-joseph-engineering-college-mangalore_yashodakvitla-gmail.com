/*You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.*/

import java.util.Scanner;
public class Slidingwindow {
    void maxSlidingwindow(int[] nums,int k){
	for(int i=0;i<nums.length;i++){
            int max=nums[i];             	//storing a first value in the sliding window into max
            int m=i+k;				//to get sliding window width at each iteration
            if(m<=nums.length){				
                for(int j=i+1;j<m;j++){		//looping through the sliding window
                    if(nums[j]>max){		//calculating max value in the sliding window. checking current value is greater than max value. 
                        max=nums[j];		//storing the max to current value, if  current value is greater than max
                    }
                }
		System.out.print(max+" ");
            }else {
            	break;
            }
        }
    }
    	
    public static void main(String[] args) {
        Slidingwindow s=new Slidingwindow();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();			//reads the array size
        int[] nums=new int[n];			//Initialization
        for(int i=0;i<n;i++){
            	nums[i]=sc.nextInt();		//read array values
        }
        int k=sc.nextInt();			//read window width
        s.maxSlidingwindow(nums,k);		//call the function to perform operation
    }
}
