package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simulacion5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulacion5 window = new Simulacion5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Simulacion5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton ButtonInicio = new JButton("Inicio");
		ButtonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton ButtonTerminar = new JButton("Terminar");
		
		JLabel lblNewLabel = new JLabel("Por: aaragona@ulasalle.edu.pe");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ButtonInicio)
							.addPreferredGap(ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
							.addComponent(ButtonTerminar))
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ButtonInicio)
						.addComponent(ButtonTerminar))
					.addGap(9)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		frame.getContentPane().setLayout(groupLayout);
	}
}
