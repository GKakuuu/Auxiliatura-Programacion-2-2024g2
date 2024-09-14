package eje2;

public class Gato extends Animal{
	private String nombre;
	private String color;
	
	public Gato(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	
	public void saltar() {
		System.out.println("el gato " + nombre + " está saltando muy alegre");
	}
	
	public void maullar() {
		System.out.println(nombre + " está maullando, miau");
	}
	
	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo pollito, le gusta mucho");
	}
	
	public void dormir(String lugar) {
		System.out.println(nombre + " está durmiendo en " + lugar);
	}
	
	public void dormir(Integer horas) {
		System.out.println(nombre + "está durmiendo unas " + horas + " horas.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
