import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib7 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t2,t3,t4,t5,t6;
	JButton b1,b2;
	JFrame f7;
	Font font;
	String s3[]=new String [10];
	Lib7()
	{
		f7=new JFrame();
		f7.setSize(500,500);
		f7.setLayout(null);
		f7.setVisible(true);
		font=new Font("Gadugi",Font.BOLD,20);
		l1=new JLabel("Add Books");
		l1.setBounds(50,30,130,50);
		l1.setFont(font);
		f7.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Call no.");
		l2.setBounds(30,80,100,50);
		l2.setFont(font);
		f7.add(l2);
		t2=new JTextField();
		t2.setBounds(100,80,150,30);
		f7.add(t2);
		font=new Font("Gadugi",Font.BOLD,12);
		l3=new JLabel("Name");
		l3.setBounds(30,130,100,50);
		l3.setFont(font);
		f7.add(l3);
		t3=new JTextField();
		t3.setBounds(100,130,150,30);
		f7.add(t3);
		font=new Font("Gadugi",Font.BOLD,12);
		l4=new JLabel("Author");
		l4.setBounds(30,180,100,50);
		l4.setFont(font);
		f7.add(l4);
		t4=new JTextField();
		t4.setBounds(100,180,150,30);
		f7.add(t4);
		font=new Font("Gadugi",Font.BOLD,12);
		l5=new JLabel("Publisher");
		l5.setBounds(30,230,100,50);
		l5.setFont(font);
		f7.add(l5);
		t5=new JTextField();
		t5.setBounds(100,230,150,30);
		f7.add(t5);
		font=new Font("Gadugi",Font.BOLD,12);
		l6=new JLabel("Quantity");
		l6.setBounds(30,280,100,50);
		l6.setFont(font);
		f7.add(l6);
		t6=new JTextField();
		t6.setBounds(100,280,150,30);
		f7.add(t6);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Add Books");
		b1.setBounds(80,350,100,50);
		b1.setFont(font);
		f7.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("Back");
		b2.setBounds(80,430,100,50);
		b2.setFont(font);
		f7.add(b2);
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
		s3[4]=t6.getText();
		JOptionPane.showMessageDialog(null,"Books Added Successfully!!!");
		f7.dispose();
		new Lib5(s3); 
	}
	else if(b2==e.getSource())
	{
		f7.dispose();
		new Lib5(s3);
	}
}
}