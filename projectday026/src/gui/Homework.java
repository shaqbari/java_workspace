/*로그인 메뉴 과제*/

package gui;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Button;

class Homework{
	public static void main(String[] args){
		Frame fr=new Frame();
		fr.setVisible(true);
		fr.setSize(300,150);
		
		/*center에 panel 붙이고 gridLayout 적용,  */
		Panel pn1=new Panel();
		GridLayout grid=new GridLayout(2, 1);
		pn1.setLayout(grid);
		Panel pn1_1=new Panel();
		Panel pn1_2=new Panel();
		//Panel pn1_3=new Panel();
		//Panel pn1_4=new Panel();
		Panel pn2=new Panel();

		fr.add(pn1, BorderLayout.CENTER);
		pn1.add(pn1_1);
		pn1.add(pn1_2);
		//pn1.add(pn1_3);
		//pn1.add(pn1_4);
		fr.add(pn2, BorderLayout.SOUTH);

		Label lb1=new Label("ID");
		Label lb2=new Label("PW");
		TextField txtf1=new TextField("", 20);
		TextField txtf2=new TextField("", 20);
		txtf2.setEchoChar('*');
		//JPasswordField jpwf=new JPasswordField("", 20);
		Button bt1=new Button("로그인");
		Button bt2=new Button("회원가입");

		pn1_1.add(lb1);
		pn1_1.add(txtf1);
		pn1_2.add(lb2);
		pn1_2.add(txtf2);

		pn2.add(bt1);
		pn2.add(bt2);
	}
}
