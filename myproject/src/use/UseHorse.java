/*
���ʹ� �ٸ� ��ġ�� �����ϴ� Horse�� �Ẹ��
�ڹٴ� ���ʹ� �ٸ� ��Ű���� �ִ� Ŭ������ ������ ���� classpath ȯ�溯���� �Ĵٺ���.
���� �Ʒ��� import���� animal.Horse�� ��� �� �տ� ȯ�溯���� ���� �����Ǿ� �ִٰ�
�����ϸ� �ȴ�.
*/

package use;
//import D:\google\�ֿ뱳������\java_workspace\myproject\bin\animal\Horse.class //���� ����� ��ü�� ��θ� ���
//���� �����쿡���� ���� �ڹ��� ���ΰ�(write once run anywhere)�� �ش����� �ʴ´�.

import animal.Horse; //�տ� �߸� ��θ� os�� ����ؾ� �Ѵ�.
//������ path�� �Ϲ������� ��������ϴ� ȯ�溯���̴�.
//�׷��Ƿ� .class ������ ���� ȯ�溯���� classpath�� �߰��ϰ� ���� �߸� ��θ� �˷��ش�.
//��Ű��ȭ �Ǿ��ִ� Ŭ������ classpath�� ��ϵǾ����� ��� ����Ϸ��� java ��Ű����.Ŭ�������� ġ�� �ȴ�.
//�̰�� java use.UseHorse�� ���� �ȴ�.
//desktop����� ���α׷� �����Ҷ��� �ش� os�� classpath�� �����ϴ� ������ �־�� �Ѵ�. ���� install wizard�� ���Ե�
//������Ʈ�� �������� ��� ;�� ��� �ٸ� ��θ� �߰��Ѵ�.
//�� �տ� .;�� ����. �ش���丮�� class�� ���� ã���� ;���� ��ĭ�ٸ� �ȵȴ�.

class UseHorse{
	public static void main(String[] args){
		Horse h=new Horse();
		System.out.println("UseHorse ����");
	}
}
