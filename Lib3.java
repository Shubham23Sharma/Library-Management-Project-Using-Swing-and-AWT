import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib3 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7 ;
	JTextField t1,t3,t4,t5,t6;
	JPasswordField t2;
	JButton b1,b2,b3,b4;
	JFrame f3;
	Font font;
	String sec[]=new String[10];
	Lib3()
	{
		f3=new JFrame();
		f3.setSize(500,500);
		f3.setLayout(null);
		f3.setVisible(true);
		font=new Font("Gadugi",Font.BOLD,30);
		l1=new JLabel("Add Librarian");
		l1.setBounds(80,20,200,80);
		l1.setFont(font);
		f3.add(l1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Name : ");
		l2.setBounds(20,80,50,50);
		l2.setFont(font);
		f3.add(l2);
		t1=new JTextField();
		t1.setBounds(100,90,180,30);
		f3.add(t1);
		font=new Font("Gadugi",Font.BOLD,12);
		l3=new JLabel("Password");
		l3.setBounds(20,150,50,50);
		l3.setFont(font);
		f3.add(l3);
		t2=new JPasswordField();
		t2.setBounds(100,150,180,30);
		f3.add(t2);
		font=new Font("Gadugi",Font.BOLD,12);
		l4=new JLabel("Email");
		l4.setBounds(20,210,50,50);
		l4.setFont(font);
		f3.add(l4);
		t3=new JTextField();
		t3.setBounds(100,220,180,30);
		f3.add(t3);
		font=new Font("Gadugi",Font.BOLD,15);
		l5=new JLabel("Address");
		l5.setBounds(20,280,50,50);
		l5.setFont(font);
		f3.add(l5);
		t4=new JTextField();
		t4.setBounds(100,290,180,30);
		f3.add(t4);
		font=new Font("Gadugi",Font.BOLD,12);
		l6=new JLabel("City");
		l6.setBounds(20,350,50,50);
		l6.setFont(font);
		f3.add(l6);
		t5=new JTextField();
		t5.setBounds(100,360,180,30);
		f3.add(t5);
		font=new Font("Gadugi",Font.BOLD,12);
		l7=new JLabel("Contact No.");
		l7.setBounds(20,420,50,50);
		l7.setFont(font);
		f3.add(l7);
		t6=new JTextField();
		t6.setBounds(100,430,180,30);
		f3.add(t6);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Add Librarian");
		b1.setBounds(80,480,150,50);
		b1.setFont(font);
		f3.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("Back");
		b2.setBounds(100,550,100,30);
		b2.setFont(font);
		f3.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
	if(b1==e.getSource())
	{
			sec[0]=t1.getText();
			sec[1]=t2.getText();
			sec[2]=t3.getText();
			sec[3]=t4.getText();
			sec[4]=t5.getText();
			sec[4]=t6.getText();
		JOptionPane.showMessageDialog(null,"Librarian Added Successfully!!!! ");
		f3.dispose();
		new Lib2(sec); 	
		
	}
	else if(b2==e.getSource())
	{
		f3.dispose();
		new Lib2(sec);	
	}
}
public static void main(String args[])
{
	new Lib3();
}
}