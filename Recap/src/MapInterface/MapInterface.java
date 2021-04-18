package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Huseyin");
		map.put("SurName", "Nebili");
		map.put("country", "Turkey");

		System.out.println(map);
		System.out.println(map.get("country"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}

	}
}
