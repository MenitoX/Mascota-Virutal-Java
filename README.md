# Simulación de Mascota Virtual en Java

## Descripción General
Este proyecto implementa una simulación de una mascota virtual en Java, permitiendo al usuario interactuar con la mascota a través de un menú de consola. La simulación incluye gestión de estados de la mascota, interacciones con diferentes tipos de ítems y manejo del paso del tiempo para simular el envejecimiento de la mascota.

## Archivos del Proyecto
El proyecto consta de los siguientes archivos:

- `Estado.java`: Define los posibles estados de la mascota como un enum.
- `Item.java`: Clase abstracta para los ítems que la mascota puede usar, además implementa las subclases de `Comida`, `Medicina` y `Juguete`.
- `Inventario.java`: Gestiona una colección de ítems.
- `Mascota.java`: Representa la mascota virtual y maneja su estado y atributos.
- `Main.java`: Clase principal que ejecuta la simulación y maneja la interacción del usuario.
- `Makefile`: Archivo para compilar y ejecutar el proyecto.

## Compilación y Ejecución
### Compilación
Utiliza el archivo `Makefile` incluido para compilar todos los archivos Java del proyecto. Abre una terminal en el directorio del proyecto y ejecuta el siguiente comando:

- make : Este comando compilará todas las clases necesarias y dejará los archivos `.class` listos para ser ejecutados.
- make run : Este comando ejecutará la clase principal `Main`, la cual carga la configuración inicial de la mascota desde un archivo `config.csv` y presenta un menú de interacción al usuario.

## Cómo Usar el Programa
Al ejecutar el programa, se presentará un menú con opciones para interactuar con la mascota virtual:
- Usar un ítem del inventario para modificar los atributos de la mascota.
- Dormir para recuperar energía.
- Avanzar el tiempo para simular el envejecimiento de la mascota.
- Salir del programa.

El usuario puede seleccionar una opción ingresando el número correspondiente o seguir las instrucciones en pantalla para interactuar con la mascota.