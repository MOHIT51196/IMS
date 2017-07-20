package com.instisoft.table.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CourseTablePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public CourseTablePanel() {

		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		add(tablePanel);
		
		String columnNames[] = {"Course Id", "Course Name", "Category", "Fee", "Faculty", "Classes", "Btach Schedule"};
		
		Object[][] data = {
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},{"AF10234", "Java Core", "Software Development/Programming", "9000", "Amit Srivastava", "60", "WeekDays | Mon-Fri"},
				{"NT11131", "Advanced Java", "Software Development/Programming", "12000", "Amit Srivastava", "40", "WeekDays | Mon-Fri"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"},
				{"BF7880", "Advanced Physics", "Science", "6000", "Amit Srivastava", "30", "WeekEnds | Sat-Sun"},
				{"BF10554", "English Speaking", "Personality Development", "5000", "Amit Srivastava", "18", "WeekDays | Mon-Wed-Fri"}
				};
		
		final Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER); 
	    
	    JButton edit = new JButton("Edit");
		edit.setBounds(115, 519, 134, 35);
		modifyButton(edit);
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.getEditable().toggle();
				((DefaultTableModel) table.getModel()).fireTableStructureChanged();
				tableView(table);
			}
		});
		
		add(edit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(284, 519, 134, 35);
	    modifyButton(btnDelete);
	    btnDelete.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0){
	        	if(table.getSelectedRow() != -1){
	        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
	        	}
	        }
	    });
	    add(btnDelete);
	    
	    JButton btnSortByName = new JButton("Sort by Name");
	    btnSortByName.setBounds(452, 519, 134, 35);
	    modifyButton(btnSortByName);
	    btnSortByName.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByName);
	    
	    JButton btnSortByClass = new JButton("Sort By Classes");
	    btnSortByClass.setBounds(620, 519, 139, 35);
	    modifyButton(btnSortByClass);
	    btnSortByClass.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(5, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByClass);
	    
	    JButton btnSortByCategory = new JButton("Sort By Category");
	    btnSortByCategory.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    btnSortByCategory.setBounds(796, 519, 145, 35);
	    modifyButton(btnSortByCategory);
	    btnSortByCategory.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCategory);
	    
	    JButton btnSortByFee = new JButton("Sort By Fee");
	    btnSortByFee.setBounds(974, 519, 134, 35);
	    btnSortByFee.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSortByFee);
	    add(btnSortByFee);
	
	}
	

	void modifyButton(JButton button){
		button.setBackground(new Color(102, 255, 153));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBorderPainted(false);
	}
	
	void tableView(JTable jtable){
		TableColumnModel tcm = jtable.getColumnModel();
	      tcm.getColumn(0).setPreferredWidth(60);     //Name
	      tcm.getColumn(1).setPreferredWidth(80);    //Title
	      tcm.getColumn(2).setPreferredWidth(200);    //Surname
	      tcm.getColumn(3).setPreferredWidth(40);
	      tcm.getColumn(4).setPreferredWidth(60);
	      tcm.getColumn(5).setPreferredWidth(40);
	      tcm.getColumn(6).setPreferredWidth(100);
	      
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
					contentPane.add(new CourseTablePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
