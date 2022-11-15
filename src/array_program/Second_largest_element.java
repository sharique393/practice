package array_program;

public class Second_largest_element {

	public static void main(String[] args) {
		int arr[]= new int[] {6,8,2,4,3,7};
		int temp=0;
		System.out.println("oiginal array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] +" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println();
		System.out.println("sorted element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("second largest element is :" +arr[1]);

	}

}
