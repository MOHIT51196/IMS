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
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.utils.GUILookAndFeel;

public class DashBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel sidePanel, containerPane;
	private JLabel lblHeader;

	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	private MenuBar menuBar;
	private JToggleButton btnShowNav;
	private ArrayList<JPanel> panelList;
	private NavPanel menuNavPanel;
	
	public DashBoard() {
		super(TITLE + " Dashboard");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		setSize(700, 450);
		setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
				
		GUILookAndFeel.setGUILookAndFeel();
//		WebLookAndFeel.install();
		
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
		

		menuNavPanel = new NavPanel(this);
		contentPane.add(menuNavPanel);
		
		
		
		sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 224, 684);
//		sidePanel.setBackground(new Color(102, 255, 153));
		sidePanel.setBackground( new Color( 18, 30, 49)  );
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		btnShowNav = new JToggleButton("Show Nav");
		btnShowNav.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnShowNav.setBounds(0, 0, 73, 26);
		btnShowNav.setFocusable(false);
		btnShowNav.addItemListener((event)->{
			if(btnShowNav.isSelected()){
				((JToggleButton)event.getSource()).setText("Hide Nav");
				menuNavPanel.setVisible(true);
			}
			else{
				((JToggleButton)event.getSource()).setText("Show Nav");
				menuNavPanel.setVisible(false);
			}
		});
		
		sidePanel.add(btnShowNav);
		

		
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
		
		
//		to be in the end @OverlappingCompenent
//		BufferedImage logoImage;
//		try {
//			logoImage = ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);
//			JLabel lblLogo = new JLabel(new ImageIcon(logoImage));
//			lblLogo.setBounds(358, 0, 860, 684);
//			contentPane.add(lblLogo);
//			
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
		
		
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
