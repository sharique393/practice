package number_program;

public class Separate_number {

	public static void main(String[] args) {
		String str= "sharique123@45a";
		String number=" ";

		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);

			if(Character.isDigit(ch))
			{
				number= number+ch;
			}
		}

		System.out.println("number is :" +number);
	}

}
