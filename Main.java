// Proyecto: Gestión de Estudiantes
// Actividad formativa 3: Herencia
// Lenguaje: Java

// Clase base: contiene los datos y comportamientos comunes de cualquier estudiante.
class Estudiante {
    protected String nombre;
    protected int edad;
    protected String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método heredable que muestra la información general del estudiante.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }
}

// Clase derivada: hereda los atributos y métodos de Estudiante.
class EstudiantePresencial extends Estudiante {
    private String aula;

    public EstudiantePresencial(String nombre, int edad, String carrera, String aula) {
        super(nombre, edad, carrera); // Llama al constructor de la clase base.
        this.aula = aula;
    }

    // Sobrescritura: adapta el método heredado al tipo de estudiante.
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Reutiliza el método de la clase base.
        System.out.println("Modalidad: Presencial");
        System.out.println("Aula: " + aula);
    }

    // Método exclusivo de esta clase derivada.
    public void asistirClase() {
        System.out.println(nombre + " asiste a clases en el aula " + aula + ".");
    }
}

// Otra clase derivada que también hereda de Estudiante.
class EstudianteEnLinea extends Estudiante {
    private String plataforma;

    public EstudianteEnLinea(String nombre, int edad, String carrera, String plataforma) {
        super(nombre, edad, carrera);
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Modalidad: En línea");
        System.out.println("Plataforma: " + plataforma);
    }

    // Método exclusivo de esta clase derivada.
    public void tomarClaseVirtual() {
        System.out.println(nombre + " toma su clase virtual mediante " + plataforma + ".");
    }
}

// Clase principal: crea objetos y comprueba la herencia.
public class Main {
    public static void main(String[] args) {
        EstudiantePresencial estudiante1 =
            new EstudiantePresencial("Mario Ángeles", 20, "Ingeniería en Sistemas", "A-12");

        EstudianteEnLinea estudiante2 =
            new EstudianteEnLinea("Carlos García", 22, "Ingeniería en Sistemas", "Google Classroom");

        System.out.println("===== ESTUDIANTE PRESENCIAL =====");
        estudiante1.mostrarDatos();
        estudiante1.estudiar();       // Método heredado de Estudiante.
        estudiante1.asistirClase();   // Método propio de EstudiantePresencial.

        System.out.println();

        System.out.println("===== ESTUDIANTE EN LÍNEA =====");
        estudiante2.mostrarDatos();
        estudiante2.estudiar();       // Método heredado de Estudiante.
        estudiante2.tomarClaseVirtual(); // Método propio de EstudianteEnLinea.
    }
}
