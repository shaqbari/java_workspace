package com.ss.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		TreeSet<String> set =  new TreeSet<String>();
		set.add("���");
		set.add("����");
		set.add("�ٳ���");
		
		Iterator<String> it=set.iterator();
		
		for (String e : set) {
			System.out.println("1"+e);
		}
		
		String[] fruits={
				"����",
				"�ٳ���",
				"���"
		};
		TreeSet<String> set2 = new TreeSet<String>();
		for (String e : fruits ){
			set2.add(e);
		}
		
		Iterator<String> it2=set2.iterator();
		for (String e :set2) {
			System.out.println("2"+e);
		}
		
		/*�迭�̳� collection �����ӿ�ũ for each������ �����ϴ�.
		 * iterator�� for each���� �Ұ��� */		
		/*
		for (String str :it2) {
			System.out.println("3"+str);
		}
		*/
		
		
		while (it2.hasNext()) {
			String e = (String) it2.next();
			System.out.println("3"+e);
		}	
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		/*
		for (int i = 0; i < fruits.length; i++) {
			list.add(fruits[i]);
		}
		*/
				
		for (String e : fruits) {
			list.add(e);
		}
		
		for (String e : list) {
			System.out.println("5"+e);
		}
	
	}

}
