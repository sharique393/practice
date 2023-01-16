package array_program;

public class Rotate_the_element {

	public static void main(String[] args) {
		// i/p- 1 2 3 4 5
		// o/p- 4 5 1 2 3 
		
		int arr[]= {1,2,3,4,5};
		int n=3;
		
		for(int i=1;i<=3;i++)
		{
			int temp=arr[0];
			int j;
			for( j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
			
		}
		for(int each: arr)
		{
			System.out.print(each+" ");
		}
		
	}

}
