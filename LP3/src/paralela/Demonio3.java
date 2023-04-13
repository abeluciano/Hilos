package paralela;

public class Demonio3 extends Thread {
	
	public Demonio3(String algo) {
		super (algo);
	}
	
	public void run() {
		for(;;) {
			System.out.println(this.getName() + ": Hola mundo");
			try {
				sleep((int) (Math.random() * 2000));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
