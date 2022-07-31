package listbox;

import java.util.ArrayList;

public class demo
{
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("xyzab");
		
		
		for(String s1:al)
		{
			System.out.println(s1.length());
		}
		
		
	}

}
