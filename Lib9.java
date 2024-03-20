import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib9 extends JFrame implements ActionListener
{
	JFrame f9;
	JLabel l1,l2,l3;
	JTextField t2,t3;
	JButton b1,b2;
	Font font;
	String s6[]=new String[10];
	Lib9()
	{
		f9=new JFrame();
		f9.setSize(500,500);
		f9.setLayout(null);
		f9.setVisible(true);
		font=new Font("Gadugi",Font.BOLD,25);
		l1=new JLabel("Return Book");
		l1.setBounds(80,30,200,50);
		l1.setFont(font);
		f9.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Book Callno.");
		l2.setBounds(30,80,100,50);
		l2.setFont(font);
		f9.add(l2);
		t2=new JTextField();
		t2.setBounds(150,90,150,30);
		f9.add(t2);
		font=new Font("Gadugi",Font.BOLD,12);
		l3=new JLabel("Student Id.");
		l3.setBounds(30,150,100,50);
		l3.setFont(font);
		f9.add(l3);
		t3=new JTextField();
		t3.setBounds(150,160,150,30);
		f9.add(t3);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Return Book");
		b1.setBounds(100,250,150,50);
		b1.setFont(font);
		f9.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("Back");
		b2.setBounds(100,320,150,50);
		b2.setFont(font);
		f9.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
		if(b1==e.getSource())
		{
			f9.dispose();
			JOptionPane.showMessageDialog(null,"Book Returned Successfully!!!");
		}
		else if(b2==e.getSource())
		{
			f9.dispose();
			new Lib5(s6);
		}
}
public static void main(String args[])
{
	new Lib9();
}
}