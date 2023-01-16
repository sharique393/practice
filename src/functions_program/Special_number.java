package functions_program;

public class Special_number {

	public static void main(String[] args) {
		int num=145;
		int result=Special_number.factorial(num);
		Special_number.display(result, num);
		
	}
	
	public static int factorial(int n)
	{
		int sum=0;
		while(n>0)
		{
			int ld= n%10;
			int fact=1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		return sum;
	}
	public static void display(int s, int n)
	{
		if(s==n)
		{
			System.out.println("special number");
		}
		else
		{
			System.out.println("not special number");
		}
	}

}
