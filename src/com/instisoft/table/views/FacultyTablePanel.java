package com.instisoft.table.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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

import com.instisoft.form.dto.FacultyDTO;
import com.instisoft.form.helper.FacultyHelper;
import com.instisoft.utils.GUILookAndFeel;

public class FacultyTablePanel extends JPanel {

private static final long serialVersionUID = 1L;
	
	private static FacultyTablePanel instance;

	private Table table;
	
	private FacultyHelper facultyHelper;
	private ArrayList<FacultyDTO> facultyList;
	
	{
		facultyHelper = new FacultyHelper();
		facultyList = new ArrayList<>();
	}
	public static FacultyTablePanel newInstance(){
		
		if(instance == null){
			instance = new FacultyTablePanel();
		}
		
		return instance;
	}
	
	private FacultyTablePanel() {

		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		add(tablePanel);
		
		String columnNames[] = {"Faculty Id", "Faculty Name", "Gender", "Email", "Phone", "Batches", "DOB", "DOJ", "Salary"};
		
		
		final Toggle isEditable = new Toggle(false);
		
		table = new Table(columnNames, 0, isEditable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER); 
	    
	    renderFacultyList();
	    
	    JButton edit = new JButton("Edit");
		edit.setBounds(120, 519, 134, 35);
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
		btnDelete.setBounds(292, 519, 134, 35);
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
	    btnSortByName.setBounds(462, 519, 134, 35);
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
	    
	    JButton btnSortByCourse = new JButton("Sort By Batch");
	    btnSortByCourse.setBounds(629, 519, 139, 35);
	    modifyButton(btnSortByCourse);
	    btnSortByCourse.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(5, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCourse);
	    
	    JButton btnSortByCategory = new JButton("Sort By Joining");
	    btnSortByCategory.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    btnSortByCategory.setBounds(798, 519, 145, 35);
	    modifyButton(btnSortByCategory);
	    btnSortByCategory.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(7, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCategory);
	    
	    JButton btnSortByTime = new JButton("Sort By Salary");
	    btnSortByTime.setBounds(974, 519, 134, 35);
	    btnSortByTime.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(8, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSortByTime);
	    add(btnSortByTime);
	    
	
	}
	

	void modifyButton(JButton button){
		button.setBackground(GUILookAndFeel.getThemeColor());
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setFocusPainted(false);

	}
	
	void tableView(JTable jtable){
		TableColumnModel tcm = jtable.getColumnModel();
	      tcm.getColumn(0).setPreferredWidth(60);    
	      tcm.getColumn(1).setPreferredWidth(140);   
	      tcm.getColumn(2).setPreferredWidth(50);    
	      tcm.getColumn(3).setPreferredWidth(60);
	      tcm.getColumn(4).setPreferredWidth(70);
	      tcm.getColumn(5).setPreferredWidth(100);
	      tcm.getColumn(6).setPreferredWidth(50);
	      tcm.getColumn(7).setPreferredWidth(50);
	      tcm.getColumn(8).setPreferredWidth(70);
	}
	
	public void renderFacultyList(){
		
		DefaultTableModel model = ((DefaultTableModel)table.getModel());
		
		facultyList.clear();
		
		try {
			if(facultyHelper.readFaculties(facultyList)){
				
				model.setRowCount(0);
				
				facultyList.forEach((faculty)->{
					Object[] arrBatch = {
						faculty.getId(),
						faculty.getName(),
						faculty.getGender(),
						faculty.getPrimaryEmail(),
						faculty.getPrimaryContact(),
						faculty.getBatch().getName(),	
						faculty.getDob(),
						faculty.getDoj(),
						faculty.getSalary()
					};
					
					
					model.addRow(arrBatch);
				});
				
				System.out.println("FETCHED FACULTIES SUCCESSFULLY");
			}
			else{
				System.out.println("NO FACULTIES ARE ADDED");
			}
		} catch (ClassNotFoundException | SQLException err) {
			
			err.printStackTrace();
		}
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
					contentPane.add(new FacultyTablePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
