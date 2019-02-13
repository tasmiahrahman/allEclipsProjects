package excellSheetRead;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Apple", "apel");
		dictionary.put("Orange", "Komola");
		
		dictionary.put("Mango", "aam");
		
		dictionary.put("Papaya", "Komola");
		
		String q = dictionary.put("Mango", "Fozli");
		
		
		
		Set<Entry<String, String>> s = dictionary.entrySet();
		
		Iterator<Entry<String, String>> it = s.iterator();

		while(it.hasNext()) {
			Entry<String, String> e = it.next();
			System.out.println(e.getKey() + "   " + e.getValue());
		}
		
		System.out.println(q);
	}
	
}
