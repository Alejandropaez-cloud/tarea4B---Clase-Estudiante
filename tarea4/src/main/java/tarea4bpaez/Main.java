package tarea4bpaez;

public class Main {
    public static void main(String[] args) {

        // Crear objetos de Estudiante
        Estudiante estudiante1 = new Estudiante("Ricardo Dominguez", 101, "1DAW");
        Estudiante estudiante2 = new Estudiante("Ingris ", 102, "1DAW");

        // Establecer notas
        estudiante1.setNotaMedia(10.0);
        estudiante2.setNotaMedia(0.1);

        // Imprimir información de los estudiantes
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        // Comprobar si los estudiantes aprobaron
        System.out.println(estudiante1.getNombre() + " aprobado: " + estudiante1.aprobado());
        System.out.println(estudiante2.getNombre() + " aprobado: " + estudiante2.aprobado());
        
    }
}