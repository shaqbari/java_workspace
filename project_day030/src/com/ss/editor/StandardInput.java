/*1.��Ʈ���� ���⼭�� ���� �з�
 * -�Է� ���
 * 
 * 2. ��Ʈ���� ������ ó������� ���� �з�
 *  1) ����Ʈ ��� ��Ʈ��: ����½� 1byte�� ó�� (����)
 *  2) ���� ��� ��Ʈ��: ����½� 2byte�� ��� ������ �� �ִ� ��Ʈ�� (���׷��̵� ����, 3d�Ȱ�ó�� 1byte�� 2byte�� ����)
 *  		����!!)2byte�� �аų�, ���°� �ƴϴ�. ������ byte���
 *  		���ڱ�ݽ�Ʈ���� ����Ģ
 *  		�Է½�Ʈ��: ~~Reader����
 *  		��½�Ʈ��: ~~writer����
 *  
 *  3) ���� ��Ʈ��
 *  
 */


package com.ss.editor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		//��Ʈ�� ���	
		InputStream is=System.in; //System���� �̸� ������ new�� ���� �ʴ´�.
		InputStreamReader reader=null;		
		reader=new InputStreamReader(is);
		
		int data;
		try {			
			//while (true) {
				data = reader.read();  //block
				System.out.print((char)data); //�ѱ��� 2byte�̹Ƿ� �Ϻθ� ��µǾ� ������.
			//}				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * System.in;//ǥ���Է�
	 * System.out;//ǥ�����
	 * */
	
	//�ַܼα�â�� Ű����κ��� �Է¹��� ���ڸ� �޸��忡 �����ϴ°� �߰��ؼ� txt�� ����//�׳� ����

}
