package epa.projeto;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class myApp {

	private JFrame frame;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					myApp window = new myApp();
					window.frame.setVisible(true);
				} catch (Exception e) { e.printStackTrace(); }
			}
		});

	}
	
	public myApp() {
		initialize();
	}
	
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("Hello World!");
		lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblHelloWorld.setBounds(166, 202, 276, 44);
		frame.getContentPane().add(lblHelloWorld);
	}
}
