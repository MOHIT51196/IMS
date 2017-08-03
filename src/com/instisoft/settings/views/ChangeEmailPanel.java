package com.instisoft.settings.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ChangeEmailPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ChangeEmailPanel() {
		setBackground(Color.BLACK);
		setLayout(null);
		setOpaque(true);
		setBounds(0, 0, 450, 300);
		
		JLabel lblCurrentEmail = new JLabel("Current Email :");
		lblCurrentEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCurrentEmail.setForeground(Color.WHITE);
		lblCurrentEmail.setBounds(10, 65, 116, 14);
		add(lblCurrentEmail);
		
		textField = new JTextField();
		textField.setBounds(136, 64, 304, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewEmail = new JLabel("New Email :");
		lblNewEmail.setForeground(Color.WHITE);
		lblNewEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewEmail.setBounds(10, 134, 116, 14);
		add(lblNewEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 133, 304, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDone.setForeground(new Color(0, 0, 0));
		btnDone.setBackground(Color.WHITE);
		btnDone.setBounds(178, 234, 89, 23);
		add(btnDone);

	}

}
