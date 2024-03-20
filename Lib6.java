import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Lib6 extends JFrame implements ActionListener
{
	JFrame f6;
	JLabel l1;
	JButton b1,b2;
	JTextField t1;
	Font font;
	String a[]=new String[4];
	Lib6()
	{
		f6=new JFrame();
		f6.setSize(500,500);
		f6.setLayout(null);
		f6.setVisible(true);
		font=new Font("Gadugi",Font.BOLD,12);
		l1=new JLabel("Enter Book ID");
		l1.setBounds(30,20,80,50);
		l1.setFont(font);
		f6.add(l1);
		t1=new JTextField();
		t1.setBounds(150,30,100,30);
		f6.add(t1);
		font=new Font("Gadugi",Font.BOLD,12);
		b1=new JButton("Delete");
		 b1.setBounds(80,100,80,50);
		b1.setFont(font);
		f6.add(b1);
		font=new Font("Gadugi",Font.BOLD,12);
		b2=new JButton("Back");
		b2.setBounds(80,180,80,50);
		b2.setFont(font);
		f6.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
		if(b2==e.getSource())
		{
			f6.dispose();
			new Lib2(a);
		}
		else if(b1==e.getSource())
		{
			f6.dispose();
			JOptionPane.showMessageDialog(null,"Record Deleted Successfully!!");
}

}
public static void main(String args[])
{
	new Lib6();
} 
}
