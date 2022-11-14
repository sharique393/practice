package array_program;

public class Element_at_evenposition {

	public static void main(String[] args) {
		int arr[]= new int[] {1,3,2,4,5,6,7};
		System.out.println(" element present in an even position");
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}

}
