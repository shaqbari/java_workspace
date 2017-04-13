/*����ó���� ����
=������ ������ ����(�� �������� �ý��� ��� ����)

�Ϲ������� ���α׷��� ���� ����� �� ���� ��Ȳ�� ������ "����"�� �Ѵ�.
sun������ ������ ���� ���� �з��Ͽ� Ŭ������ �����ϰ� �ִ�.

1. ���α׷��Ӱ� ��ü�� �� ���� �Ұ��׷��� ����=Error
	
2. ���α׷��Ӱ� ��ó�� �� �ִ� ����=Exception(����)
	�ڹپ���� ���ɻ����� �ٷ� �����̴�.
	sun������ �� ���ܸ� ��Ȳ�� ���� ü������ Ŭ������ �����ϰ� �ִ�.
	
	�� ���� ��ü���� �ٽ� ũ�� 2���� �������� �з��ȴ�.
		1) ������ Ÿ�ӿ� ����ó���� �����ϴ� ���=Checked Exception
		2) ������ Ÿ�ӿ� ����ó���� �������� �ʴ� ���=Unchecked Exception(Runtime Exception) 

�켱 �����Ϸ��� ����ó���� �϶�� �Ҷ��� ����ó���� �ϸ� �ȴ�. 
*/

package com.ss.copy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy2{
	FileInputStream fis;	//������ ������� �� �Է½�Ʈ��
	FileOutputStream fos; //������ ��������� ��½�Ʈ��

	public FileCopy2(){
		//�Ʒ��� �ڵ�� ����, ������ �߻��� �� �ִ� ���ɼ��� �ִ� �ڵ��̴�.
		//���� �����ڰ� ������ �� �ۼ��������� �ұ��ϰ�, Ư���� ������ġ�� �����ϱ⸦ �����Ѵ�.
		try{
			fis=new FileInputStream("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/res/jeju01.jpg");
			//System.out.println("���Ͻ�Ʈ���� �����߽��ϴ�.");
			
			fos=new FileOutputStream("D:/google/�ֿ뱳������/java_workspace2/project_day030/src/com/ss/data/jeju01_copy.jpg");
			//�������� ����� �ش�.

			int data;
			/*
			data=fis.read(); //1byte�� �о����!
			System.out.println(data);//������ ���� ���¿��� ���ڱ� ������ �������ų� ���� �� �� �ִ�.
			data=fis.read(); //���� 1byte�� �о����
			System.out.println(data);
			*/
			
			while(true){
				data=fis.read(); //1byte�� �о����
				fos.write(data); //1byte ����!

				if(data==-1)break; //�����̸� �̷��� �ۼ�����
				//���ڵ� ������ write�� ��� �Ѵ�. �ȱ׷��� �������� -1�� �� ������ ���������� �ִ�.

				System.out.println(data);
			}
		}catch(FileNotFoundException e){ //������ �߻��ϸ� ����ΰ� �� �������� ���Եȴ�. 
			//catch���� �����ϸ� ���α׷��� ���������ᰡ ���� �ʰ� ��������� �ϰ� �ȴ�.
			//����ڿ��� �ȳ��ϴ� �뵵�� �ַ� catch���� ����ϰ� �ȴ�.
			System.out.println("������ ã�� �� �����ϴ�.");

			//�ɰ��� ������ ��� �����ڿ� �̸��� �����ϴ� ����� �߰��� ���� �ִ�.			
		}catch(IOException e){
			System.out.println("������ ���� �� �����ϴ�.");
		}finally{//��� ������ ������ ����
			//finally�� �����ϸ�, try���� �����ϴ� ����ΰ� ������ �� ������ ���ļ� ����.
			//finally�ڵ��� ������
			/*�ַ� db������ ��Ʈ�� ����
			�������θ� ������ ������ �ڿ��� �ݰų� ������ �Ϸ��� try���̴� catch���� 
			�����ϴ� ������ ���ľ� �ϴ� ������ �α� �����̴�.*/			
			try{
				if(fis!=null && fos!=null){
					fis.close();
					fos.close();
				}
			}catch(IOException e){
				System.out.println("������ ���� �� �����ϴ�.");
			}
		}
		
		
		//Stream�� �������� ���ϰ� ����� stream�� �����ؾ��Ѵ�.
		//���ϸ� ��� stream�� �þ �޸� ���������� �Ͼ��.
		/*�Ʒ�ó�� ���� ���� �ʰ� finally�� �̿��Ѵ�.
		try{
			if(fis!=null){
				fis.close(); //��ǲ��Ʈ�� ���� ����!
				//fFileNotFoundException�߻��ϸ� fis�� �޸𸮿� �ö��� �ʱ� ������
				//nullpointExeption�߻��ϹǷ� ��ȿ��üũ�� �����ؾ���
			}
			if(fos!=null){
				fos.close();//�ƿ�ǲ ��Ʈ�� ���� ����!
			}
		}catch(IOException e){
			System.out.println("������ ���� �� �����ϴ�.");
		}
		*/
	}

	/*����: ������ �޸��� �����ο� ���� �����ɰ� ���� ���� ����߰�
	������ Ž���� â�߰� ���ϴ� ���� ������ ������ ���� �ְ�
	�Ͽ��� �������� ����
	*/

	public static void main(String[] args){
		new FileCopy2();
	}
}
