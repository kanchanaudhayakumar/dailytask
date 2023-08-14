package week2.day1;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {3,2,11,4,6,7};
		int len=data.length;
		System.out.println("array length is" +len);
		Arrays.sort(data);
		System.out.println("ascending order");
		for (int i=0; i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("second largest number is" +data[len-2]);

	}

}
