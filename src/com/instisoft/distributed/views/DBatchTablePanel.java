package com.instisoft.distributed.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.instisoft.table.views.Table;
import com.instisoft.table.views.Toggle;

public class DBatchTablePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Id;
	private JTextField textField_Bname;
	private JTextField textField_Cname;
	private JTextField textField_Category;
	private JTextField textField_Faculty;
	private JTextField textField_StartDate;
	private JTextField textField_EndDate;
	private JTextField textField_Hours;
	private JTextField textField_Timings;
	
	/**
	 * Create the panel.
	 */
	public DBatchTablePanel() {
		
		setSize(1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBackground(null);
		leftPanel.setOpaque(false);
		add(leftPanel);
		
		JPanel detailsPanel = new JPanel();
		detailsPanel.setLayout(null);
		detailsPanel.setBackground(null);
		detailsPanel.setOpaque(false);
		add(detailsPanel);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setLayout(new BorderLayout());
		tablePanel.setBackground(null);
		tablePanel.setOpaque(false);
		tablePanel.setSize(554, 500);
		leftPanel.add(tablePanel);
		
		String columnNames[] = {"S. No.", "Batch Name", "Course Name"};
		
		Object[][] data = {
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"},
				{"1.", "May Evening 5-7", "Java Core"}
		};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("Batch Id");
		lblId.setBounds(25, 50, 100, 25);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblId);
		
		textField_Id = new JTextField();
		textField_Id.setText((String) table.getValueAt(0, 1));
		textField_Id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Id.setColumns(10);
		textField_Id.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Id.setBounds(135, 48, 100, 30);
		textField_Id.setEditable(false);
		detailsPanel.add(textField_Id);
		
		JLabel lblBname = new JLabel("Batch Name");
		lblBname.setBounds(25, 91, 100, 25);
		lblBname.setForeground(Color.WHITE);
		lblBname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblBname);
		
		textField_Bname = new JTextField();
		textField_Bname.setText((String) table.getValueAt(0, 1));
		textField_Bname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Bname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Bname.setColumns(10);
		textField_Bname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Bname.setBounds(135, 89, 367, 30);
		textField_Bname.setEditable(false);
		detailsPanel.add(textField_Bname);
		
		JLabel lblCname = new JLabel("Course Name");
		lblCname.setBounds(25, 132, 100, 25);
		lblCname.setForeground(Color.WHITE);
		lblCname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCname);
		
		textField_Cname = new JTextField();
		textField_Cname.setText((String) table.getValueAt(0, 1));
		textField_Cname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Cname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Cname.setColumns(10);
		textField_Cname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Cname.setBounds(135, 130, 150, 30);
		textField_Cname.setEditable(false);
		detailsPanel.add(textField_Cname);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(295, 132, 90, 25);
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCategory);
		
		textField_Category = new JTextField();
		textField_Category.setText((String) table.getValueAt(0, 1));
		textField_Category.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Category.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Category.setColumns(10);
		textField_Category.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Category.setBounds(394, 130, 150, 30);
		textField_Category.setEditable(false);
		detailsPanel.add(textField_Category);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setBounds(25, 173, 100, 25);
		lblFaculty.setForeground(Color.WHITE);
		lblFaculty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblFaculty);
		
		textField_Faculty = new JTextField();
		textField_Faculty.setText((String) table.getValueAt(0, 1));
		textField_Faculty.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Faculty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Faculty.setColumns(10);
		textField_Faculty.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Faculty.setBounds(135, 171, 250, 30);
		textField_Faculty.setEditable(false);
		detailsPanel.add(textField_Faculty);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(25, 214, 100, 25);
		lblStartDate.setForeground(Color.WHITE);
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblStartDate);
		
		textField_StartDate = new JTextField();
		textField_StartDate.setText((String) table.getValueAt(0, 1));
		textField_StartDate.setHorizontalAlignment(SwingConstants.LEFT);
		textField_StartDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_StartDate.setColumns(10);
		textField_StartDate.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_StartDate.setBounds(135, 212, 150, 30);
		textField_StartDate.setEditable(false);
		detailsPanel.add(textField_StartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(295, 214, 100, 25);
		lblEndDate.setForeground(Color.WHITE);
		lblEndDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblEndDate);
		
		textField_EndDate = new JTextField();
		textField_EndDate.setText((String) table.getValueAt(0, 1));
		textField_EndDate.setHorizontalAlignment(SwingConstants.LEFT);
		textField_EndDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_EndDate.setColumns(10);
		textField_EndDate.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_EndDate.setBounds(394, 212, 150, 30);
		textField_EndDate.setEditable(false);
		detailsPanel.add(textField_EndDate);
		
		JLabel lblHoursPerClass = new JLabel("Hours/Class");
		lblHoursPerClass.setBounds(25, 255, 100, 25);
		lblHoursPerClass.setForeground(Color.WHITE);
		lblHoursPerClass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblHoursPerClass);
		
		textField_Hours = new JTextField();
		textField_Hours.setText((String) table.getValueAt(0, 1));
		textField_Hours.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Hours.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Hours.setColumns(10);
		textField_Hours.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Hours.setBounds(135, 253, 100, 30);
		textField_Hours.setEditable(false);
		detailsPanel.add(textField_Hours);
		
		JLabel lblTimings = new JLabel("Batch Timings");
		lblTimings.setBounds(295, 255, 100, 25);
		lblTimings.setForeground(Color.WHITE);
		lblTimings.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblTimings);
		
		textField_Timings = new JTextField();
		textField_Timings.setText((String) table.getValueAt(0, 1));
		textField_Timings.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Timings.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Timings.setColumns(10);
		textField_Timings.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Timings.setBounds(394, 253, 150, 30);
		textField_Timings.setEditable(false);
		detailsPanel.add(textField_Timings);
		
		JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Id.setEditable(true);
			textField_Bname.setEditable(true);
			textField_Cname.setEditable(true);
			textField_Category.setEditable(true);
			textField_Faculty.setEditable(true);
			textField_StartDate.setEditable(true);
			textField_EndDate.setEditable(true);
			textField_Hours.setEditable(true);
			textField_Timings.setEditable(true);
		});
	    modifyButton(btnEdit);
	    detailsPanel.add(btnEdit);
	    
	    JButton btnSort = new JButton("Sort");
	    btnSort.setSize(150, 35);
	    btnSort.setLocation(200, 511);
	    btnSort.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSort);
	    leftPanel.add(btnSort);
	   
	    
	    JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(321, 511, 160, 35);
	    modifyButton(btnDelete);
	    btnDelete.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0){
	        	if(table.getSelectedRow() != -1){
	        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
	        	}
	        }
	    });
	    detailsPanel.add(btnDelete);
	
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(100);     
	      tcm.getColumn(1).setPreferredWidth(400);    
	      tcm.getColumn(2).setPreferredWidth(250);    
	}
	
	void modifyButton(JButton btn){
		btn.setBackground(new Color(102, 255, 153));
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/*btn.setContentAreaFilled(false);
		btn.setOpaque(true);
		btn.setBorderPainted(false);*/
		btn.setFocusPainted(false);

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
						
						contentPane = new JPanel();
						contentPane.setBackground(SystemColor.windowBorder);
						contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
						contentPane.setLayout(null);
						contentPane.add(new DBatchTablePanel());
						frame.setContentPane(contentPane);
						
						
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}

}
