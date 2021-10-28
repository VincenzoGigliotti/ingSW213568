package unical.id.ProvaIngSw_213568;

import java.util.Collections;
import java.util.List;

public class MyListUtil {
	
	public List<Integer> sort (List<Integer> list, int order) {
		if (order == 0) {
			Collections.sort(list);
			return list;
		}
		if (order == 1) {
			Collections.sort(list, Collections.reverseOrder());
			return list;
		}
		return list;
	}
}
