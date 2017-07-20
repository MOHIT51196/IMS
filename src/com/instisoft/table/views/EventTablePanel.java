package com.instisoft.table.views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class EventTablePanel extends JPanel {

	private static final long serialVersionUID = 1L;


	

	/**
	 * Create the frame.
	 */
	public EventTablePanel() {
		
		setSize( 1118, 569);
		setLayout(null);
		setBackground(null);
		setOpaque(false);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		add(tablePanel);
		

		
		String[] header = {"S. No.", "Name", "Date", "Venue", "Time", "Description"};
		
		Object[][] data = {
		{"2.", "Demo For Java", new Date(11/8/2017), "Budi", "2:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Aemo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Zemo For Java", new Date(12/8/2017), "Cudi", "112:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Bemo For Java", new Date(9/8/2017), "Sudi", "42:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Rudi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		{"1.", "Demo For Java", new Date(10/8/2017), "Audi", "12:00", "Demostration for what is java and why it is so popular"},
		};
		
		final Toggle editable = new Toggle(false);
		
		
		Table table = new Table(header, data, editable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);  
	      
	        
	    
	    JButton btnSortByName = new JButton("Sort by Name");
	    btnSortByName.setBounds(580, 519, 150, 35);
	    modifyButton(btnSortByName);
	    btnSortByName.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
	    		sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(sortKeys);
	    	}
	    });
	    
	    add(btnSortByName);
	    
	    Action enableAction = new AbstractAction("Edit")
        {
            
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e)
            {
                table.getEditable().toggle(); //toggle current value
                ((AbstractTableModel) table.getModel()).fireTableStructureChanged();
                tableView(table);
            }
        };
        

	    
	    JButton btnEdit = new JButton("Edit");
	    btnEdit.setBounds(199, 519, 150, 35);
	    modifyButton(btnEdit);
	    btnEdit.setAction(enableAction);
	    add(btnEdit);
	    
	    JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(390, 519, 150, 35);
	    modifyButton(btnDelete);
	    btnDelete.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	            // check for selected row first
	            if (table.getSelectedRow() != -1) {
	                // remove selected row from the model
	                ((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
	            }
	        }
	    });
	    add(btnDelete);
	    
	    JButton btnSortByDate = new JButton("Sort By Date");
	    btnSortByDate.setBounds(771, 519, 150, 35);
	    modifyButton(btnSortByDate);
	    btnSortByDate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
	    		sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(sortKeys);
	    	}
	    });
	    
	    add(btnSortByDate);
	    
	    JButton btnSortByVenue = new JButton("Sort By Venue");
	    btnSortByVenue.setBounds(958, 519, 150, 35);
	    modifyButton(btnSortByVenue);
	    btnSortByVenue.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
	    		sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(sortKeys);
	    	}
	    });
	    add(btnSortByVenue);
	    
	    JButton btnSendReminders = new JButton("Send Reminders");
	    btnSendReminders.setBounds(1185, 519, 150, 35);
	    modifyButton(btnSendReminders);
	    add(btnSendReminders);
	    
	}
	
	void modifyButton(JButton button){
//		button.setBackground(new Color(102, 255, 153));
		button.setBackground(new Color( 18, 30, 49) );
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setFocusPainted(false);
	}
	
	void tableView(JTable jtable){
		TableColumnModel tcm = jtable.getColumnModel();
	      tcm.getColumn(0).setPreferredWidth(40);     //Name
	      tcm.getColumn(1).setPreferredWidth(60);    //Title
	      tcm.getColumn(2).setPreferredWidth(200);    //Surname
	      tcm.getColumn(3).setPreferredWidth(50);
	      tcm.getColumn(4).setPreferredWidth(50);
	      tcm.getColumn(5).setPreferredWidth(400);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 1400, 1000);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.getContentPane().setLayout(null);
					frame.setBackground(Color.GRAY);
					
					JPanel contentPane = new JPanel();
					contentPane.setBackground(SystemColor.windowBorder);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(null);
					contentPane.add(new EventTablePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
