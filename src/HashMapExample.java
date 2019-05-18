import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Ranadheer");
		hm.put(2, "Sathya");
		hm.put(3, "Rahul");
		hm.put(4, "Ranadheer");
		hm.put(5, "Sathya");
		hm.put(6, "Rahul");
		hm.put(null, null);
	
		hm.put(7, null);
		Set set=hm.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}
