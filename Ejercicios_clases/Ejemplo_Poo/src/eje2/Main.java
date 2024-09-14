package eje2;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Perro perro1 = new Perro("Skar", "5 meses", "Pastor Aleman");
		Gato gato1 = new Gato("Pelusa", "blanco");
		
		animal1.dormir();
		animal1.comer();
		System.out.println();
		
		perro1.ladrar();
		perro1.correr();
		perro1.comer();
		System.out.println();
		
		gato1.comer();
		gato1.dormir(4);
		gato1.dormir("la sala");
		gato1.saltar();
		gato1.maullar();
		

	}

}
