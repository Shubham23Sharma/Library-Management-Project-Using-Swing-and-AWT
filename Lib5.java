import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib5 extends JFrame implements ActionListener
{
	JFrame f5;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6;
	Font font;
	String se[]=new String[10];
	Lib5(String s3[])
	{
		for(int i=0;i<s3.length;i++)
		{
			se[i]=s3[i];
		}
		
		f5=new JFrame();
		f5.setSize(500,500);
		f5.setVisible(true);
		f5.setLayout(null);
		font=new Font("Gadugi",Font.BOLD,25);
		l1=new JLabel("Librarian Section");
		l1.setBounds(80,20,200,50);
		l1.setFont(font);
		f5.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Add Books");
		b1.setBounds(100,100,150,50);
		b1.setFont(font);
		f5.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("View Books");
		b2.setBounds(100,160,150,50);
		b2.setFont(font);
		f5.add(b2);
		font=new Font("Gadugi",Font.BOLD,12);
		b3=new JButton("Issued Books");
		b3.setBounds(100,220,150,50);
		b3.setFont(font);
		f5.add(b3);
		font=new Font("Gadugi",Font.BOLD,12);
		b4=new JButton("View Issued Books");
		b4.setBounds(100,280,150,50);
		b4.setFont(font);
		f5.add(b4);
		font=new Font("Gadugi",Font.BOLD,12);
		b5=new JButton("Return Book");
		b5.setBounds(100,340,150,50);
		b5.setFont(font);
		f5.add(b5);
		font=new Font("Gadugi",Font.BOLD,12);
		b6=new JButton("Log Out");
		b6.setBounds(100,400,150,50);
		b6.setFont(font);
		f5.add(b6);
		font=new Font("Gadugi",Font.BOLD,12);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
		if(b1==e.getSource())
		{
			f5.dispose();
			new Lib7();
		}
		else if(b2==e.getSource())
		{
			f5.dispose();
			new Lib11(se);	
		}
		else if(b6==e.getSource())
		{
			f5.dispose();
			new Lib();
		}
		else if(b5==e.getSource())
		{
			f5.dispose();
			new Lib9();
		}
		else  if(b4==e.getSource())
		{
			f5.dispose();
			new Lib11(se);
		}
		else if(b3==e.getSource())
		{
			f5.dispose();
			new Lib8();
		}
}
}