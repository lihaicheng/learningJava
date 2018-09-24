package languageDemo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DefaulSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arrayList = new ArrayList<Integer>();
		System.out.println(arrayList.toString());
		for(int i = 0 ; i < arrayList.size() ; i++)
		{
			arrayList.add(i);
		}
		arrayList.add(arrayList.size());
		System.out.println(arrayList.size());
		List linkedlist = new LinkedList<>();
		
	}

}
