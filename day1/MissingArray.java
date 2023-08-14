package week2.day1;

import java.util.Arrays;

public class MissingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			int num =i+1;
			if(num!=arr[i])
			{
				System.out.println("mising number array is "+num);
				break;
			}
		}

	}

}
