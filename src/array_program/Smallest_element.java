package array_program;

public class Smallest_element {

	public static void main(String[] args) {
		int arr[]= new int[] {25,11,7,76,65};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("smallest number is :" +min);


	}

}
