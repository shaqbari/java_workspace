package com.ss.gui;

import javax.swing.JButton;

public class ArrayTest {
	//var arr =new Array(); js에서
	
	//자바를 포함한 대부분의 응용프로그램에서는 배열 선언시, 반드시 그 크기를 명시해야한다.

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
