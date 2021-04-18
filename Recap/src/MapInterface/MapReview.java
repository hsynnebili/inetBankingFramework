package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.xml.bind.ValidationEvent;

public class MapReview {
	public static void main(String[] args) {

		Map<Integer, Capital> cap = new LinkedHashMap<>();
		Capital cap1 = new Capital("USA", 1, "Washington");
		Capital cap2 = new Capital("Turkey", 90, "Ankara");
		Capital cap3 = new Capital("Russia", 80, "Moscow");
		Capital cap4 = new Capital("France", 68, "Paris");

		cap.put(1, cap1);
		cap.put(2, cap2);
		cap.put(3, cap3);
		cap.put(4, cap4);

		Iterator<Map.Entry<Integer, Capital>> it = cap.entrySet().iterator();
		while (it.hasNext()) {

			Map.Entry<Integer, Capital> entry = it.next();
			//Capital value = it.next().getValue();
			System.out.println(entry.getKey()+ ":" + entry.getValue().capitalOfCounrty + " " + entry.getValue().codeOfCountry + " "
					+  entry.getValue(). counrty);

		}

	}

}
