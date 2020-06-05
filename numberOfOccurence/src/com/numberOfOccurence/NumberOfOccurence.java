package com.numberOfOccurence;


public class  NumberOfOccurence{
	
	public static void main(String[] args)  {
		//looking this number
		int n = 0;
		//total number
		int k = 10000;
		System.out.print("From: "+k+" the tolal number of "+n+" is ");
		numberOfOccurence(n, k);
	}
	//finding number of occurence in the given numbers
	private static void numberOfOccurence(int n, int k) {
		//Occurance cunter
		int count = 0;
		//change into string to use string methods
		String ns = Integer.toString(n);

		
		for (int j = 0; j < k; j++) {	
			//changing the single number into string
			String ks = Integer.toString(j);
			
			//Breacking down number into single digit
			char[] cs = ks.toCharArray();
			
			//check the single digit of k is the same as n
			for (int i = 0; i < cs.length; i++) {
				//change the single digit into string
				String str = String.valueOf(cs[i]);
				if (ns.contains(str))
					count++;
			}
		}
		System.out.println(count);
	}
}