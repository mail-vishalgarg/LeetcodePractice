package HashMap;

import java.util.HashMap;

/** How to create a nested HashMap and how to 
 * retrieve values from a nested HashMap
 *
 */
public class NestedHashMap {
	public static HashMap DataStructure;
	
	public static void main(String[] args){
		DataStructure = new HashMap();
		HashMap hm = new HashMap();
		hm.put("title", "Google");
		hm.put("link" , "http://www.google.com");
		
		DataStructure.put("google",hm);
		
		HashMap hm1 = new HashMap();
		hm1.put("title", "yahoo");
		hm1.put("link","http://www.yahoo.com");
		
		DataStructure.put("Yahoo",hm1);
		System.out.println((String)((HashMap) DataStructure.get("google")).get("title"));
		
		if (DataStructure.get("google").getClass() == HashMap.class){
			System.out.println("this is a nested Hashmap");
		}
	}
}
