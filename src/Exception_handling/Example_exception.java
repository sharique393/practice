package Exception_handling;

public class Example_exception {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		try
		{
			System.out.println(arr[2]);
		}
		catch(Exception x)
		{
			System.out.println("i am catch block");
		}
		finally
		{
			System.out.println("i am finally block");
		}

	}

}


