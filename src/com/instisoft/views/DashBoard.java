package com.instisoft.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DashBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel sidePanel, containerPane;
	private JLabel lblHeader;

	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	private MenuBar menuBar;
	
	private ArrayList<JPanel> panelList;
	
	public DashBoard() {
		super(TITLE + " Dashboard");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		setSize(700, 450);
		setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
		
//		for all the panels in the Dashboard
		panelList = new ArrayList<>();
		
		
		menuBar = new MenuBar(this);
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		

		JLabel lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
		lblInstisoft.setBounds(1198, 11, 154, 34);
		contentPane.add(lblInstisoft);
		
		sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 224, 678);
		sidePanel.setBackground(new Color(102, 255, 153));
		contentPane.add(sidePanel);
		
		containerPane = new JPanel();
		containerPane.setBounds(234, 98, 1118, 569);
		containerPane.setBackground(null);
		containerPane.setOpaque(false);
		containerPane.setLayout(null);
		contentPane.add(containerPane);
		
		lblHeader = new JLabel("Welcome to Dashboard");
		lblHeader.setVerticalAlignment(SwingConstants.CENTER);
		lblHeader.setBackground(null);
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Times New Roman", Font.BOLD, 42));
		lblHeader.setOpaque(false);
		lblHeader.setBorder(new EmptyBorder(0, 6, 0, 6));
		lblHeader.setBounds(234, 25, 935, 66);
		contentPane.add(lblHeader);
		
		this.setVisible(true);
	}
	
	
	
	public ArrayList<JPanel> getPanelList() {
		return panelList;
	}



	public void setPanelList(ArrayList<JPanel> panelList) {
		this.panelList = panelList;
	}



	public void setHeader(String title){
		lblHeader.setText(title);
	}
	
	private void hideContainerComponents(){
		panelList.forEach((panel)->{
			panel.setVisible(false);
		});
	}
	
	public void showPanel(JPanel panel){
		
		hideContainerComponents();
		
		if(panelList.contains(panel)){
			panel.setVisible(true);
		}
		else{
			addPanel(panel);
		}
	}
	
	public void addPanel(JPanel panel){
		panelList.add(panel);
		containerPane.add(panel);
		repaint();
		
	}
	
	public void addToSidePanel(JComponent component){
		sidePanel.add(component);
	}
	
	public static void main(String[] args) {
		new DashBoard();
	}
}
