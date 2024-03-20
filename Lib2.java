import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib2 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4;
	JFrame f2;
	Font font;
	String s[]=new String [10];
	Lib2(String sec[])
	{
		for(int i=0;i<sec.length;i++)
		{
			s[i]=sec[i];
		}
		f2=new JFrame();
		font=new Font("Gadugi",Font.BOLD,30);
		JLabel l1=new JLabel("Admin Section");
		l1.setBounds(133,30,250,60);
		l1.setFont(font);
		f2.add(l1);
		font=new Font("Gadugi",Font.BOLD,15);
		b1=new JButton("Add Librarian");
		b1.setBounds(150,100,180,60);
		b1.setFont(font);
		f2.add(b1);
		font=new Font("Gadugi",Font.BOLD,15);
		b2=new JButton("View Librarian");
		b2.setBounds(150,180,180,60);
		b2.setFont(font);
		f2.add(b2);
		font=new Font("Gadugi",Font.BOLD,15);
		b3=new JButton("Delete Librarian");
		b3.setBounds(150,260,180,60);
		b3.setFont(font);
		f2.add(b3);
		font=new Font("Gadugi",Font.BOLD,15);
		b4=new JButton("LogOut");
		b4.setBounds(150,340,180,60);
		b4.setFont(font);
		f2.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f2.setSize(500,500);
		f2.setLayout(null);
		f2.setVisible(true);
		
	}
public void actionPerformed(ActionEvent e)
{
	if(b1==e.getSource())
	{
		f2.dispose();
		new Lib3();
	}
	else if(b2==e.getSource())
	{
		f2.dispose();
		new Lib10(s);
	}
	else if(b4==e.getSource())
	{
		f2.dispose();
		new Lib();
	}
	
}


}