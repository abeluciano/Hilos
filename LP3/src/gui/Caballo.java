package gui;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Caballo extends Thread {
	
	JProgressBar jpb_1;
	JTextArea jta_1;
	int N = 100;
	static int FIN = 4;
	
	public Caballo(JProgressBar jpb) {
		this.jpb_1 = jpb;
	}
	
	public Caballo(JTextArea jta) {
		this.jta_1 = jta;
	}

	public void run() {
		
		this.jpb_1.setValue(0);
		for(int i=1; i<N; i++) {
			this.jpb_1.setValue(i);
			//for ( int j = 0; j <= FIN; j++) {
				//System.out.println("Posicion" + j + ": " + getName());
			//}
			try {
				sleep((int)(Math.random() * 2000));
				//System.out.println("El caballo " + getName() + " descansa.");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("Fin de la carrera para: " + getName());
	}
}
