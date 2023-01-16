package functions_program;

public class Frequency {

	public static void main(String[] args) {
		String arr[]= {"AA","BB","CC","AA","AA","BB","BB"};
		for(int j=0;j<arr.length;j++)
		{
			int res=Frequency.count(arr, arr[j], j);
			if(res>3)
				System.out.println(arr[j]);

		}
					
	}
	public static int count(String a[], String s, int b)
	{
		int count=1;
		for(int i=b+1;i<a.length;i++)
		{
			if(a[i]==s)
			count++;
		}
		return count;
	}
	

}
