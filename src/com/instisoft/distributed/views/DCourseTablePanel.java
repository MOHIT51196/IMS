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

public class DCourseTablePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Id;
	private JTextField textField_Cname;
	private JTextField textField_Category;
	private JTextField textField_Faculty;
	private JTextField textField_Fee;
	private JTextField textField_Classes;
	private JTextField textField_Schedule;
	
	/**
	 * Create the panel.
	 */
	public DCourseTablePanel() {
		
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
		
		String columnNames[] = {"S. No.", "Course Name", "Category"};
		
		Object[][] data = {
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"},
				{"1.", "Java Core", "Software Development/Programming"}
		};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("Course Id");
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
		
		JLabel lblCname = new JLabel("Course Name");
		lblCname.setBounds(25, 91, 100, 25);
		lblCname.setForeground(Color.WHITE);
		lblCname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCname);
		
		textField_Cname = new JTextField();
		textField_Cname.setText((String) table.getValueAt(0, 1));
		textField_Cname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Cname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Cname.setColumns(10);
		textField_Cname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Cname.setBounds(135, 89, 150, 30);
		textField_Cname.setEditable(false);
		detailsPanel.add(textField_Cname);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(25, 132, 90, 25);
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCategory);
		
		textField_Category = new JTextField();
		textField_Category.setText((String) table.getValueAt(0, 1));
		textField_Category.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Category.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Category.setColumns(10);
		textField_Category.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Category.setBounds(135, 130, 212, 30);
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
		textField_Faculty.setBounds(135, 171, 150, 30);
		textField_Faculty.setEditable(false);
		detailsPanel.add(textField_Faculty);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setBounds(336, 50, 64, 25);
		lblFee.setForeground(Color.WHITE);
		lblFee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblFee);
		
		textField_Fee = new JTextField();
		textField_Fee.setText((String) table.getValueAt(0, 1));
		textField_Fee.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Fee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Fee.setColumns(10);
		textField_Fee.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Fee.setBounds(404, 48, 150, 30);
		textField_Fee.setEditable(false);
		detailsPanel.add(textField_Fee);
		
		JLabel lblClasses = new JLabel("Classes");
		lblClasses.setBounds(336, 91, 64, 25);
		lblClasses.setForeground(Color.WHITE);
		lblClasses.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblClasses);
		
		textField_Classes = new JTextField();
		textField_Classes.setText((String) table.getValueAt(0, 1));
		textField_Classes.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Classes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Classes.setColumns(10);
		textField_Classes.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Classes.setBounds(404, 89, 150, 30);
		textField_Classes.setEditable(false);
		detailsPanel.add(textField_Classes);
		
		JLabel lblSchedule = new JLabel("Batch Schedule");
		lblSchedule.setBounds(25, 214, 100, 25);
		lblSchedule.setForeground(Color.WHITE);
		lblSchedule.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblSchedule);
		
		textField_Schedule = new JTextField();
		textField_Schedule.setText((String) table.getValueAt(0, 1));
		textField_Schedule.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Schedule.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Schedule.setColumns(10);
		textField_Schedule.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Schedule.setBounds(135, 212, 206, 30);
		textField_Schedule.setEditable(false);
		detailsPanel.add(textField_Schedule);
		
		JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Id.setEditable(true);
			textField_Cname.setEditable(true);
			textField_Category.setEditable(true);
			textField_Faculty.setEditable(true);
			textField_Fee.setEditable(true);
			textField_Classes.setEditable(true);
			textField_Schedule.setEditable(true);
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
	      tcm.getColumn(1).setPreferredWidth(250);    
	      tcm.getColumn(2).setPreferredWidth(400);    
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
						contentPane.add(new DCourseTablePanel());
						frame.setContentPane(contentPane);
						
						
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}

}
