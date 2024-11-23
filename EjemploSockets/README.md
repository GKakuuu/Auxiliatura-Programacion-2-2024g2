# Funcionamiento de la Aplicación Básica de Sockets


`Paso 1`: Ejecutar el archivo `Servidor.java` para que el servidor entre en funcionamiento. Podrá comprobar que el servidor se está ejcutando correctamente si en la consola puede visualizar el siguiente mensaje:

```
SERVIDOR EN FUNCIONAMIENTO ...
A LA ESPERA DE DATOS ... 
```

`Paso 2`: Ejecutar el archivo `Cliente.java` para que el cliente entre en funcionamiento.

`Paso 3`: En la consola de la clase `Cliente` definir la cantidad de datos que se quieran enviar al servidor.

`Paso 4`: Una vez enviados todos los datos del `Cliente` al `Servidor`, en la consola de este último se podrá visualizar los datos recibidos correctamente.

# Explicación de las clases ocupadas en el Ejemplo
## 1. Clase Cliente

Esta clase configura el Cliente para que sea capáz de enviar objetos de tipo `Persona` a la clase `Servidor`, permitiendo la introducción de los datos de los objetos mediante consola.

## 2. Clase Persona

Esta clase manejará el tipo de objeto que se enviará desde la clase `Cliente` a la clase `Servidor`.

## 3. Clase Servidor

Esta clase configura el Servidor para que sea capáz de recibir los objetos de tipo `Persona` de la clase `Cliente` y que pueda mostrarlos en consola.
