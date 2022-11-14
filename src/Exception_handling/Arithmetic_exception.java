package Exception_handling;

public class Arithmetic_exception {

	public static void main(String[] args) {
		int num=9;
		int deno=0;
		try {
			int c= num/deno;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividing by 0. kindly use another number");
		}


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			//e.printStackTrace();
			System.out.println("did not wait for 5 second");
		}

		System.out.println("i am the last statement in main method");

	}

}




