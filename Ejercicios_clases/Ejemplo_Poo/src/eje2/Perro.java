package eje2;

public class Perro extends Animal{
	private String nombre;
	private String edad;
	private String raza;
	
	public Perro(String nombre, String edad, String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	public void correr() {
		System.out.println("mi perro " + nombre + " está corriendo");
	}
	public void ladrar() {
		System.out.println("Guau! Guau!");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo croquetas");
	}
		
}
