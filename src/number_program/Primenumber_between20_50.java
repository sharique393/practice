package number_program;

public class Primenumber_between20_50 {

	public static void main(String[] args) {
		for(int i=20;i<=50;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("prime number is :" +i);
			}
		}

	}

}
