package gui;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Caballo extends Thread {
	
	public JProgressBar jpb_1;
	public JTextArea jta_1;
	int N = 100;
	static int FIN = 2;
	
	public Caballo(JProgressBar jpb, JTextArea jta, String N) {
		super (N);
		this.jpb_1 = jpb;
		this.jta_1 = jta;
	}
	
	public void run() {
		
		this.jpb_1.setValue(0);
		for(int i=1; i<N; i++) {
			
			for ( int j = 0; j <= FIN; j++) {
				
				this.jta_1.append("Posicion " + j + ": " + getName() + "\n");
				System.out.println("Posicion " + j + ": " + getName());

				try {
					sleep((int) (Math.random() * 1000));
					this.jta_1.append("El caballo " + getName() + " descansa."+ "\n");
					System.out.println("El caballo " + getName() + " descansa.");
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			this.jta_1.append("Fin de la carrera para: " + getName()+ "\n");
			System.out.println("Fin de la carrera para: " + getName());
			
			this.jpb_1.setValue(i);
			
			
			try {
				sleep((int)(Math.random() * 1000));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


