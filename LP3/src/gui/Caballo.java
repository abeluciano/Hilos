package gui;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Caballo extends Thread {
	
	public JProgressBar jpb_1;
	public JTextArea jta_1;
	int N = 100;
	static int FIN = 3;
	double time1;
	double time2;
	public Caballo(JProgressBar jpb, JTextArea jta, String N) {
		super (N);
		this.jpb_1 = jpb;
		this.jta_1 = jta;
	}
	
	public void run() {
		
		this.jpb_1.setValue(0);	
		long start = System.nanoTime();
		for ( int j = 1; j <= N; j++) {
				
			this.jta_1.append("Posicion " + j + ": " + getName() + "\n");
				
			try {
				long start1 = System.nanoTime();
				sleep((int) (Math.random() * 1000));
				this.jta_1.append("El caballo " + getName() + " descansa."+ "\n");
				long end1 = System.nanoTime();
				time1 = end1 - start1;
					
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			this.jpb_1.setValue(j);
		}
		this.jta_1.append("Fin de la carrera para: " + getName()+ "\n");
		long end = System.nanoTime();
		time2 = end - start;
		time2 = time2 - time1;	
		System.out.print("El caballo " + getName() + " descanso: " + time1+ "\n");
		System.out.print("El caballo " + getName() + " corrió: " + time2+ "\n");
		}
}


