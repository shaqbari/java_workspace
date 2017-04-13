/*컬렉션 프레임웍 중 순서없는 객체들을
 * key-value쌍으로 관리하는 Map을 사용해본다.*/

package com.ss.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// 키와 밸류의 자료형을 둘다 generic으로 표시해줘야 한다.

		map.put("zino1187", "민진호");
		map.put("zddo1123", "룰루");
		map.put("zido1237", "랄라");

		String obj = map.get("zino1187"); // key값으로 객체 탐색

		System.out.println(obj);

		Set<String> set = map.keySet(); //set형으로 바꿔줘야 iterator를 이용해 모든 자료를 출력할 수 있다.
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next(); //key가 입력된다.
			String value=map.get(key);
			System.out.println(value);
		}
		
		//아래는 나의 실험
		for (String e : set) {
			System.out.println("for each"+" "+e+" "+map.get(e));
		}
		
		Set<Map.Entry<String, String>>entries= map.entrySet();
		for (Map.Entry<String, String> e : entries) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
