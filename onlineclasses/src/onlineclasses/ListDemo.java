package onlineclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10908);
		list.add(34876);
		list.add(89);
		list.add(3762);
//		System.out.println(list);
		/*using iterator*/
//		Iterator i=list.iterator();
//		while(i.hasNext())
//		{
//			System.out.print(i.next()+" ");
//		}
		/*using for loop*/
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		/*deafault sorting methods*/
//		Collections.sort(list);
//		Collections.reverse(list);
		/*using comparator to sort manually*/
//		Comparator<Integer> c=new Comparator<Integer>()
//				{
//			public int compare(Integer i,Integer j)
//			{
//				return i%10>j%10?1:-1;
//			}
//				
//			};
		/*applying lambda expressions*/
//		Comparator<Integer> c=(i,j)-> i%10>j%10?1:-1;
		
		Collections.sort(list, (i,j)-> i%10>j%10?1:-1);
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}

}
