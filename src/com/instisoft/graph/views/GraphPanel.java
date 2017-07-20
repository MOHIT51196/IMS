package com.instisoft.graph.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class GraphPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;


	public GraphPanel() {

		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(27, 11, 1030, 510);
		add(tabbedPane);
		
		JPanel lineGraphPanel = LineChart.createChartPanel();
		lineGraphPanel.setBackground(Color.BLACK);
		lineGraphPanel.setLayout(null);
		tabbedPane.addTab("Line Graph", null, lineGraphPanel, null);
		
		JPanel barGraphPanel = BarChart.createChartPanel();
		barGraphPanel.setBackground(Color.BLACK);
		barGraphPanel.setLayout(null);
		tabbedPane.addTab("Bar Graph", null, barGraphPanel, null);
		
		JPanel xyGraphPanel = XYChart.createChartPanel();
		xyGraphPanel.setLayout(null);
		xyGraphPanel.setBackground(Color.BLACK);
		tabbedPane.addTab("XY Graph", null, xyGraphPanel, null);
		
		JPanel pieGraphPanel = PieChart.createChartPanel();
		pieGraphPanel.setLayout(null);
		pieGraphPanel.setBackground(Color.BLACK);
		tabbedPane.addTab("Pie Graph", null, pieGraphPanel, null);
		
		
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
					contentPane.add(new GraphPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
