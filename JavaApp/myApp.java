package epa.projeto;


import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class myApp {

	private JFrame frame;
	
	// Construtor chama as funções do aplicativo.
	public myApp() {
		windowInitialize();
	}
	
	// Função que define todas as funções do aplicativo.
	private void windowInitialize()
	{
		// Inicializa a janela inicial
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Hello World
		JLabel lblHelloWorld = new JLabel("Hello World!");
		lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblHelloWorld.setBounds(166, 202, 276, 44);
		frame.getContentPane().add(lblHelloWorld);
	}
	
	public static void main(String[] args) 
	{
		SerialTest arduino = new SerialTest();
		arduino.initialize();
		arduino.writeport("y");
		
		Thread t = new Thread() {
			public void run() {
				// a próxima linha vai manter essa aplicação aberta por 1000 segundos,
				// esperando eventos ocorrerem e respondendo eles (imprimindo mensagens no console).
				try {Thread.sleep(1000000);} catch (InterruptedException ie) {}
			}
		};
		t.start();
		System.out.println("Started");
		
		arduino.close();
		
		// Inicializa a janela do aplicativo
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
}
