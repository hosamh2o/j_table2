package jtables;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class view extends JFrame {

	private JPanel jpane;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnSelect;
	private JButton btnUpdate;
	private JButton btnInsert;
	private JButton btnDelete;
	private modelclass modelobj;
	private String[] data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		jpane = new JPanel();
		jpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jpane);
		jpane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 183, 414, 167);
		jpane.add(scrollPane);
		
		model = new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column"
				}
			);
		table = new JTable();
		table.setModel(model);
		table.setBounds(10, 11, 414, 149);
		
		scrollPane.setColumnHeaderView(table.getTableHeader());
		scrollPane.setViewportView(table);
		
		btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				modelobj.select();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		btnSelect.setBounds(335, 11, 89, 23);
		jpane.add(btnSelect);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					modelobj.select();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(335, 45, 89, 23);
		jpane.add(btnUpdate);
		
		btnInsert = new JButton("Insert");
		btnInsert.setBounds(335, 79, 89, 23);
		jpane.add(btnInsert);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(335, 113, 89, 23);
		jpane.add(btnDelete);
		
	    
	}
	

}
