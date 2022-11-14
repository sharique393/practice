package Exception_handling;

public class Try_alone {

	public static void main(String[] args) {
		try
		{
		//	System.out.println("i am sharique");
			int c=10/0;
			System.out.println(c);
		}
		finally
		{
			System.out.println("i am finally block");
		}
		 
		System.out.println("i am last statement in main()");

	}

}



