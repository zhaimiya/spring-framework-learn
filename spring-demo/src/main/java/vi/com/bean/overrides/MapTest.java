package vi.com.bean.overrides;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

	public static boolean hasAlias(String name, String alias) {
		Map<String, String> map = new HashMap<>(16);
		map.put("k1","v1");
		map.put("k1","v1");
//		map.put("k1","v1");
//		map.put("k1","v1");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String registeredName = entry.getValue();
			if (registeredName.equals(name)) {
				String registeredAlias = entry.getKey();
				if (registeredAlias.equals(alias) || hasAlias(registeredAlias, alias)) {
					return true;
				}
			}
		}
		return false;
	}
}
