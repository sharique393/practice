package array_program;

public class Frequency_count {

	public static void main(String[] args) {
		String arr[]= {"AA","BB","AA","DD","CC","DD","CC"};
		String fake="fake";

		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=fake)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=fake;
					}
				}
			}
			if(count>=2)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
