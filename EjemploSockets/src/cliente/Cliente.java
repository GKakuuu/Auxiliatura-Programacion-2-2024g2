package cliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import objeto.Persona;

public class Cliente {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        int port = 1234;
        String host = "localhost";

        //ESTABLECER CONEXION
        Socket cliente = new Socket(host, port);

        //ENTORNO DE EJECUCIÓN
        ObjectOutputStream salidaDatos = new ObjectOutputStream(cliente.getOutputStream());

        //DEFINIR LA CANTIDAD DE USUARIOS A ENVIAR
        System.out.print("Que cantidad de Usuarios desea enviar al servidor ?: ");
        int cant = read.nextInt();
        read.nextLine();

        //CREAR EL ARREGLO DE PERSONAS
        ArrayList<Persona> arrayPersona = new ArrayList<Persona>();

        //LLENAR DICHO ARREGLO
        for (int i = 0 ; i < cant ; i++) {
            System.out.println("nIntroduzca el Nombre del Usuario:");
            String nombre = read.nextLine();
            System.out.println("Introduzca la Edad del Usuario:");
            String edad = read.nextLine();
            System.out.println("Introduzca el Email del Usuario:");
            String email = read.nextLine();
            Persona aux = new Persona(nombre, edad, email);
            arrayPersona.add(i, aux);
        }
        
        //ENVIO DE LOS DATOS AL SERVIDOR
        salidaDatos.writeInt(arrayPersona.size());
        for (int i = 0 ; i < cant ; i++) {
            salidaDatos.writeObject(arrayPersona.get(i));
        }

        //FINALIZAR LA CONEXIÓN
        cliente.close();
    }
}