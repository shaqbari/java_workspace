/*�÷��� �����ӿ� �� �������� ��ü����
 * key-value������ �����ϴ� Map�� ����غ���.*/

package com.ss.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// Ű�� ����� �ڷ����� �Ѵ� generic���� ǥ������� �Ѵ�.

		map.put("zino1187", "����ȣ");
		map.put("zddo1123", "���");
		map.put("zido1237", "����");

		String obj = map.get("zino1187"); // key������ ��ü Ž��

		System.out.println(obj);

		Set<String> set = map.keySet(); //set������ �ٲ���� iterator�� �̿��� ��� �ڷḦ ����� �� �ִ�.
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next(); //key�� �Էµȴ�.
			String value=map.get(key);
			System.out.println(value);
		}
		
		//�Ʒ��� ���� ����
		for (String e : set) {
			System.out.println("for each"+" "+e+" "+map.get(e));
		}
		
		Set<Map.Entry<String, String>>entries= map.entrySet();
		for (Map.Entry<String, String> e : entries) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
