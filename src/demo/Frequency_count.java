package demo;

import java.util.HashMap;

public class Frequency_count {

	public static void main(String[] args) {
		String str= "1d1eeMC1MmE22f12ghiid".toLowerCase();
		
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='@')
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]='@';
					}
				}
				hm.put(ch[i], count);
			}
		}
		for(Character key: hm.keySet())
		{
			System.out.println(key+" : " +hm.get(key));
		}
				

	}

}
