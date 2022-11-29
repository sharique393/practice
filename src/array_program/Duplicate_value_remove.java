package array_program;

import java.util.HashSet;

public class Duplicate_value_remove {

	public static void main(String[] args) {
		int arr[]= new int[] {1,2,3,4,2,7,8,8,3,8,1,1,2,3,4,4};
		HashSet<Integer>hs=new HashSet<Integer>();
		System.out.println("duplicate element in an array");
		for(int ele:arr)
		{
			hs.add(ele);
		}
		for(int val:hs)
		{
			System.out.println(val);
		}
	}

}
