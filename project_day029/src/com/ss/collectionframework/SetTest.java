/*�÷��� �����ӿ��� ���� 2���� ��
 * �������� ��ü���� ������ Set������ �˾ƺ���
 * */

package com.ss.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// Set�� �ڽĵ��� TreeSet�� ����� ����. set�� �ߺ��� �ڷᰡ �Ұ����ϸ� ������ ����.
		TreeSet<String> set = new TreeSet<String>();

		set.add("���");
		set.add("����");
		set.add("������");

		/*
		 * String[] str = new String[set.size()]; set.toArray(str);
		 * 
		 * for (int i = 0; i < str.length; i++) { String msg = str[i];
		 * System.out.println(msg);
		 	}
		 */
		/*
		 * �÷��� �����ӿ��� ��ü �� �������� ��ü�� ����ϴ� ����, �뷮�� ó���� �ݺ��������� ����� �� ���ٴ� ����� �ε�ģ��
		 * �ذ�å) ���� ���� ����--> �����ְ� ������(���) Enumeration(����), Iterator(�ֽ�)
		 */
		
		//iterator�� �������̽��̹Ƿ� new�� �ȵǰ� �ڽ��� ����� ����ؾ� �ϳ�
		//sun�翡���� �ڽ��� ������� �ʰ� ����� �� �ִ� ����� ����� �ξ���.
		//�̰�� TreeSet�� iterator()�޼ҵ带 �̿��� Iterator���� �ڷ������� ��ȯ�ϴ� ���̴�.
		Iterator<String> it = set.iterator(); // �ڷ����� ����ؾ� ����ȯ�� ���ص��ȴ�.
		/*
		String e1 = it.next(); // ������ҿ� ����
		String e2 = it.next(); // ������ҿ� ����
		String e3 = it.next(); // ������ҿ� ����
		// String e4=it.next(); //������ҿ� ���� ���� ������ ����
		*/
		/*
		 * if (it.hasNext==true) {
		 * 	 	for(){
		 * 		}
		 *  }
		 */

		/*
		 * �ݺ������� for, while���� �ִ�.
		 *  for���� ���۰� ������ ��ġ�� �˰� ������ �����ϴ�.
		 *  While���� �Ұ�ȣ����  true�� ���� �����Ѵ�. 
		 *  �ݺ��� ���ڸ� �𸣰ų� ���Ҷ� �����ϴ�.
		 * 
		 *  int=0;
		 *  while(){
		 *  	 i++;
		 *  	 if(i>=256){
		 *  		 break;
		 *  	 }
		 *   }
		 * 
		 */

		while (it.hasNext()) {
			String e = it.next();// ���� ��ҿ� ����
			System.out.println(e);
		}

		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String e = it2.next();// ���� ��ҿ� ����
			System.out.println(e);
		}
	}
}
