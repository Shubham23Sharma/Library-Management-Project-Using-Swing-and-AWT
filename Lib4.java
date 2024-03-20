import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lib4 extends JFrame implements ActionListener
{
	JFrame f4;
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	Font font;
	String s1,s2;
	String s10[]=new String[10];
	Lib4()
	{
		
		f4=new JFrame();
		f4.setSize(500,500);
		f4.setVisible(true);
		f4.setLayout(null);
		font=new Font("Gadugi",Font.BOLD,25);		
		l3=new JLabel("Librarian LogIn Form");
		l3.setBounds(50,30,250,50);
		l3.setFont(font);
		f4.add(l3);
		font=new Font("Gadugi",Font.BOLD,12);
		l1=new JLabel("Enter Name : ");
		l1.setBounds(30,80,100,50);
		l1.setFont(font);
		f4.add(l1);
		t1=new JTextField();
		t1.setBounds(150,90,100,30);
		f4.add(t1);
		font=new Font("Gadugi",Font.BOLD,12);
		l2=new JLabel("Enter Password");
		l2.setBounds(30,160,100,30);
		f4.add(l2);
		l2.setFont(font);
		t2=new JPasswordField();
		t2.setBounds(150,160,100,30);
		f4.add(t2);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("LOGIN");
		b1.setBounds(100,230,80,50);
		f4.add(b1);
		b1.setFont(font);
		b1.addActionListener(this);
		}
public void actionPerformed(ActionEvent e)
{
		s1=t1.getText();
		s2=t2.getText();
		if(b1==e.getSource())
		{
			if(s1.equals("Admin")&&s2.equals("12345"))
			{
			f4.dispose();
			new Lib5(s10);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
			}
		}
} 
}