package eje1;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Pedro", "Gomez", 123456);
		Estudiante estudiante1 = new Estudiante("Juan", "Pinto", 456789, 101010, "odontologia", "UATF");
		
		System.out.println(persona1.getName());
		System.out.println(estudiante1.getName());
		
		System.out.println(estudiante1.MostrarDatos());
		
	}

}
