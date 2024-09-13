package eje1;

public class Estudiante extends Persona{
	private Integer RU;
	private String carrera;
	private String universidad;
	
	public Estudiante(String name, String lastName, Integer cI, Integer rU, String carrera, String universidad) {
		super(name, lastName, cI);
		RU = rU;
		this.carrera = carrera;
		this.universidad = universidad;
	}
	
	public String MostrarDatos() {
		return ("nombre: " + getName() + " Apellido: " + lastName + "RU: " + RU  + " Carrera: " + carrera + " Universidad:" +universidad);
	}
	
	
}
