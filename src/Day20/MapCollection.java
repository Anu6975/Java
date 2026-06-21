package Day20;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hMap = new HashMap();
		
		hMap.put(1, 'A');
		hMap.put(2, 'b');
		hMap.put(3, 'c');
		hMap.put(4, 'd');
		hMap.put(5, 'e');
		hMap.put(6, 'f');
		
//		System.out.println(hMap);
		
		Set s1 = hMap.entrySet();
		Iterator iterator= s1.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");	
		}
		
		
		LinkedHashMap lMap = new LinkedHashMap();
		
		lMap.put(1, 'A');
		lMap.put(2, 'N');
		lMap.put(3, 'U');
		lMap.put(4, 'J');
		lMap.put(5, 'A');
		lMap.put(6, 'A');
		
//		System.out.println(hMap);
		
		System.out.println();
		Set s2 = lMap.entrySet();
		Iterator it= s2.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next()+ " ");	
		}
		
		System.out.println();
		TreeMap tMap = new TreeMap();
		
		tMap.put(1, 'A');
		tMap.put(2, 'N');
		tMap.put(3, 'U');
		tMap.put(4, 'J');
		tMap.put(5, 'A');
		tMap.put(6, 'A');
		
		System.out.println();
		
		System.out.println();
		Set s3 = tMap.entrySet();
		Iterator itt= s3.iterator();
		
		while (itt.hasNext()) {
			System.out.print(itt.next()+ " ");	
		}
	}
}
