package collection_program;

import java.util.HashMap;

public class Frequency_count {

	public static void main(String[] args) {
		String str="atif iqbal";
		str=str.replaceAll("\s+","");
		char arr[]= str.toCharArray();
		
	//	HashMap<String,Integer> hm= new HashMap<>();
		HashMap<Character,Integer> hm= new HashMap<>();
		
		for(char ch: arr)
		{
			int c=1;
			
			if(hm.containsKey(ch))
			{
				c=hm.get(ch);
				hm.put(ch, ++c);
			}
			else
			{
				hm.put(ch,c);
			}
		}
		System.out.println("frequency of each character: ");
		
		for( char ch: hm.keySet())
		{
			System.out.println(ch+"----" +hm.get(ch));
		}
		
	}

}
