/*
 * �÷��� �����ӿ� api��ü�� list�迭�� ������ü�� Vector�� �н��غ���
 * List�迭�� �츮�� ���� ��Դ� �迭�� ���� ����
 *                �迭:                            list
 * ũ��:  ũ��ݵ�� ���                ���û���, ������
 * ���:	�ڹٱ⺻�ڷ���+��ü��		���� ��ü��
 * */

package com.ss.collectionframework;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//�÷��� �����ӿ� ��ü�� Generic Type�� ����ϸ�, ��ü�� ���̴� ���� ������ Ÿ�ӿ� �������ش�. �������� ������ ���ÿ� ��!
		Vector<String> v=new Vector<String>(); 
		//String���� Vector���ȴ�. �󺧿���! �󺧰� �Ѹ��� �ڷ������� �����ϸ� ����. �ش��ڷ������� ����ȯ�� �ʿ䰡 ����.
		//generic�� ��ü�ڷ������� ����ȴ�.
		
		v.add("���");
		v.add("����");
		//v.add(new JButton("����ư")); //���������� �����ϸ鼭  ����ȯ �Ҷ� �����߻��� Ȯ�� �ſ� ����.
		v.add("�ٳ���");
		v.add("������");
		
		//Object obj=v.get(2);
		//System.out.println(obj.toString());
		
		String obj=(String)v.get(2); //generic�� �Ⱦ��ٸ� ����ȯ�� �̿��ϴ°��� fm�̴�. 
		System.out.println(obj); 
	
		for (int i = 0; i < v.size(); i++) {
			String obj2=v.get(i); //generic�� ���� �ش��ڷ������� ����ȯ�� �ʿ䰡 ����.
		}
		//�÷��� �����ӿ�ũ�� ������ �� generic�� ������. 
	}

}
