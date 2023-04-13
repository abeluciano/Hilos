package caballos;

public class OtroHilo extends Thread {
	static int FIN = 4;
	public OtroHilo(String str) {
		super(str);
	}
	
	public void run() {
		for ( int i = 0; i <= FIN; i++) {
			System.out.println("Posicion" + i + ": " + getName());
			try {
				sleep((int) (Math.random() * 2000));
				System.out.println("El caballo" + getName() + "descansa.");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Fin de la carrera para: " + getName());
	}
}
