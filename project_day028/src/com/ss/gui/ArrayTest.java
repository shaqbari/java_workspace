package com.ss.gui;

import javax.swing.JButton;

public class ArrayTest {
	//var arr =new Array(); js����
	
	//�ڹٸ� ������ ��κ��� �������α׷������� �迭 �����, �ݵ�� �� ũ�⸦ ����ؾ��Ѵ�.

	public static void main(String[] args) {	
		/*int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;*/
		
		JButton[] arr=new JButton[3];
		arr[0]=new JButton();
		arr[0]=new JButton();
		arr[0]=new JButton();
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].getText());
			
		}
	}

}
