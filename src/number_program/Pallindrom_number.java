package number_program;

public class Pallindrom_number {

	public static void main(String[] args) {
		int num=141;
		int rev=0;
		int last_digit;
		int temp=num;

		while(num!=0)
		{
			last_digit= num%10;
			num=num/10;
			rev= (rev*10) + last_digit;
		}
		if(rev==temp)
		{
			System.out.println("pallindrome number");
		}
		else
		{
			System.out.println("not pallindrom ");
		}
	}

}
