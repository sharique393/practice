package Exception_handling;

public class Try_multiple_catch {

	public static void main(String[] args) {

		int arr[]= {1,2,3};
		try
		{
			System.out.println(arr[2]); //array index out of bound exception
			int p= 9/0;    //arithmetic exceptions
			System.out.println(p);
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("I am ArrayIndexOutOfBoundsException ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I am ArithmeticException ");
		}
		finally
		{
			System.out.println("i am finally block");
		}


	}

}
