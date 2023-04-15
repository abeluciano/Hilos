package caballos;
//Probando que funcione bien
public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtroHilo c1 = new OtroHilo("caba1");
		OtroHilo c2 = new OtroHilo("caba2");
		OtroHilo c3 = new OtroHilo("caba3");
		c1.start();
		c2.start();
		c3.start();
	}

}
