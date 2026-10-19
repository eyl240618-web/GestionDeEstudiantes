class Estudiante {
    // Atributos de la clase
    String nombre;
    int edad;
    String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Metodo para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creacion de objetos
        Estudiante estudiante1 = new Estudiante(
            "Carlos Garcia", 23, "Ingenieria en Sistemas"
        );

        Estudiante estudiante2 = new Estudiante(
            "Mario Angeles", 22, "Administracion"
        );

        // Uso de los metodos
        System.out.println("GESTION DE ESTUDIANTES");
        System.out.println("======================");

        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }
