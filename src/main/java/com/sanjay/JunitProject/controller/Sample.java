package com.sanjay.JunitProject.controller;

public class Sample {
	
	public static void main(String args[])
	{
		//input array - [1, 2, 3, 4, 5]
		// 2*3*4*5
		//3*4*5
		//O(n)
		//not any division
		
		//
		// iterate -arr[0]; 
		//arr[1]
		
		//Output - [120, 60, 40, 30, 24]
        System.out.println(" start");
		 int arr[]={1, 2, 3, 4, 5};
		 int arr1[]=new int[arr.length];
            for(int i=0;i<arr.length;i++)
            {
            	int sum=1;
            	for(int j=0;j<arr.length;j++)
            	{
            		if(i!=j)
            		{
            			sum=sum*arr[j];
            		}
            	}
            	
            	
            	
            	arr1[i]=sum;
            	sum=1;
            }
            
            for(int x:arr1)
            {
            	System.out.println(x);
            }
	}

}
