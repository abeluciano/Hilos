package gui;

import javax.swing.JTextArea;

public class Demonio4 extends Thread {
	
	public JTextArea jta_1;
	
	public Demonio4(JTextArea jta_1, String N) {
		super (N);
		this.jta_1 = jta_1;
	}
	
	public void run() {
		for(;;) {
			this.jta_1.append(this.getName() + ": Hola mundo" + "\n");
			System.out.println(this.getName() + ": Hola mundo");
			try {
				sleep((int) (Math.random() * 2000));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}