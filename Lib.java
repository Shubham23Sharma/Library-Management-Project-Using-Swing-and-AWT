import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
public class Lib extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2;
	JFrame f;
	Font font;
	Lib()
	{
		f=new JFrame();
		
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		font=new Font("Gadugi",Font.BOLD,30);
		l1=new JLabel("Library Management");
		l1.setBounds(50,20,300,50);
		l1.setFont(font);
		f.add(l1);
		font=new Font("Gadugi",Font.BOLD,15);
		b1=new JButton("Admin Login");
		b1.setBounds(100,120,180,80);
		b1.setFont(font);
		f.add(b1);
		font=new Font("Gadugi",Font.BOLD,15);
		b2=new JButton("Librarian Login");
		b2.setBounds(100,220,180,80);
		b2.setFont(font);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
f.setSize(500,500);f.setLayout(null);
		f.setVisible(true);
		
		
	}
public void actionPerformed(ActionEvent e)
{
	if(b1==e.getSource())
	{
	f.dispose();
	new Lib1();
	}
	else if(b2==e.getSource())
	{
		f.dispose();
		new Lib4();
	}
}
public static void main(String args[])
{
		new Lib();

}
}		