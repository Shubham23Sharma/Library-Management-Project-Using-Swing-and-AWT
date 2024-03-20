import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Lib1 extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3;
	JPasswordField t3;
	JButton b1,b2;
	JFrame f1;
	JTextField t1,t2;
	Font font;
	String s[]=new String [10];
	String s3,s4;
	Lib1()
	{
		f1=new JFrame();
		font=new Font("Gadugi",Font.BOLD,20);
		l1=new JLabel("Admin Login Form");
		l1.setBounds(100,20,180,50);
		l1.setFont(font);
		f1.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Enter Name");
		l2.setBounds(20,80,120,50);
		l2.setFont(font);
		f1.add(l2);
		t1=new JTextField();
		t1.setBounds(120,80,200,30);
		f1.add(t1);
		font=new Font("Gadugi",Font.BOLD,12);
		l3=new JLabel("Enter Password");
		l3.setBounds(20,120,120,50);
		l3.setFont(font);
		f1.add(l3);
		t3=new JPasswordField();
		t3.setBounds(120,130,200,30);
		f1.add(t3);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Login");
		b1.setBounds(130,200,100,30);
		b1.setFont(font);
		f1.add(b1);
		b1.addActionListener(this);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
public void actionPerformed(ActionEvent e)
{
	if(b1==e.getSource())
	{
		s3=t1.getText();
		s4=t3.getText();
		if(s3.equals("Admin") && s4.equals("12345"))
		{
			f1.dispose();
			new Lib2(s);	
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid UserName and Password");
		}
	}	
}
public static void main(String args[])
{
	new Lib1();
}
}		