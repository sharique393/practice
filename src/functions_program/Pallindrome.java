package functions_program;

public class Pallindrome {

	public static void main(String[] args) {
		int a=121;
		int result=Pallindrome.reverse(a);
		Pallindrome.display(result, a);
		
	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			rev=rev*10 + ld;
		}
		return rev;
	}
	public static void display(int r, int num)
	{
		if(r==num)
			System.out.println("pallindrome" );
		else
			System.out.println("not pallindrome");
	}

}
