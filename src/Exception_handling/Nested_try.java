package Exception_handling;

public class Nested_try {

	public static void main(String[] args) {

		int arr[]= {1,3,5};
		try
		{
			System.out.println(arr[2]);
			try
			{

				int z= 12/0;
				System.out.println(z);
			}
			catch(ArithmeticException c)
			{
				System.out.println("dividing by zero. change number");
			}
		}
		catch(Exception e)
		{
			System.out.println("outer try failed");

		}
	}
}
