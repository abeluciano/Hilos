package gui;

import javax.swing.JProgressBar;

public class Caballo extends Thread {
	
	JProgressBar jpb_1;
	int N = 10;
	
	public Caballo(JProgressBar jpb) {
		this.jpb_1 = jpb;
	}
	

	public void run() {
		
		this.jpb_1.setValue(0);
		for(int i=1; i<N; i++) {
			this.jpb_1.setValue(i);
			
			try {
				sleep((int)(Math.random() * 10000));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
