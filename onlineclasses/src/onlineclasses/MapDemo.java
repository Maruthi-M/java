package onlineclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//hashmap->not synchronized
//hashTable->synchronized
public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> emp=new HashMap<>();
		emp.put("empId", "100");
		emp.put("empName", "manu");
		emp.put("empAddress","Allur");
		//System.out.println(emp);//{empId=100, empName=manu, empAddress=Allur}
		Set<String> keys=emp.keySet();
		for(String key:keys)
		{
			System.out.println("key:"+key+" "+emp.get(key));
		}

	}

}
