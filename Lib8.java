import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib8 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t2,t3,t4,t5;
	JButton b1,b2;
	JFrame f8;
	Font font;
	String s8[]=new String[10];
	String s3[]=new String[10];
	Lib8()
	{
		f8=new JFrame();
		f8.setVisible(true);
		f8.setLayout(null);
		f8.setSize(500,500);
		font=new Font("Gadugi",Font.BOLD,25);
		l1=new JLabel("Issue Book");
		l1.setBounds(70,50,150,50);
		l1.setFont(font);
		f8.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Book Callno.");
		l2.setBounds(30,120,100,50);
		l2.setFont(font);
		f8.add(l2);
		t2=new JTextField();
		t2.setBounds(150,120,150,30);
		f8.add(t2);
		font=new Font("Gadugi",Font.BOLD,12);
		l3=new JLabel("Student Id");
		l3.setBounds(30,190,150,30);
		l3.setFont(font);
		f8.add(l3);
		t3=new JTextField();
		t3.setBounds(150,190,150,30);
		f8.add(t3);
		font=new Font("Gadugi",Font.BOLD,12);
		l4=new JLabel("Student Name");
		l4.setBounds(30,260,100,50);
		l4.setFont(font);
		f8.add(l4);
		t4=new JTextField();
		t4.setBounds(150,270,150,30);
		f8.add(t4);
		font=new Font("Gadugi",Font.BOLD,12);
		l5=new JLabel("Student Contact.");
		l5.setBounds(30,330,100,50);
		l5.setFont(font);
		f8.add(l5);
		t5=new JTextField();
		t5.setBounds(150,340,150,30);
		f8.add(t5);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Issue Book");
		b1.setBounds(80,450,100,50);
		b1.setFont(font);
		f8.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("Back");
		b2.setBounds(80,530,100,50);
		b2.setFont(font);
		f8.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
		if(b1==e.getSource())
		{
			s3[0]=t2.getText();
			s3[1]=t3.getText();
			s3[2]=t4.getText();
			s3[3]=t5.getText();
			f8.dispose();
			JOptionPane.showMessageDialog(null,"Issue Book Successfully!!!");
			new Lib5(s3);
		}
		else if(b2==e.getSource())
		{
			f8.dispose();
			new Lib5(s3);
		}
}
public static void main(String args[])
{
	new Lib8();
}
}
