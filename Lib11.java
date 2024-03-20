import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Lib11 extends JFrame implements ActionListener
{
   DefaultTableModel model;
    JTable table;
    JButton addButton, removeButton,back;
	String any[]=new String [10];
   Lib11(String se[]) 
  {
   super();
	//s.concat();
    model = new DefaultTableModel();
    model.addColumn("Call No.");
    model.addColumn("Name");
    model.addColumn("Author");
    model.addColumn("Publisher");
   model.addColumn("Quantity");
    JPanel inputPanel = new JPanel();
   	model.addRow(se);
	table = new JTable(model);
	addButton = new JButton("Add Librarian");
    addButton.addActionListener(this);
    removeButton = new JButton("Remove Selected Librarian");
    removeButton.addActionListener(this);
    back = new JButton("Back");
    back.addActionListener(this);
   
    inputPanel.add(addButton);
    inputPanel.add(removeButton);
   inputPanel.add(back);
	Container container = getContentPane();
    container.add(new JScrollPane(table), BorderLayout.CENTER);
    container.add(inputPanel, BorderLayout.NORTH);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
}
	public void actionPerformed(ActionEvent event) 
	    {
	if(addButton==event.getSource())
	{
        String[] philosopher = { "", "", "" };
        model.addRow(philosopher);
	}
	if(removeButton==event.getSource())
	{
	model.removeRow(table.getSelectedRow());
	}
	if(back==event.getSource())
	{
		dispose();
		new Lib5(any);
	}

  } 
}
