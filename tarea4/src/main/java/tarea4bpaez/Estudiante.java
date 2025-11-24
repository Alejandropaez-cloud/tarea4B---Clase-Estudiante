package tarea4bpaez;



public class Estudiante {
    // Atributos privados
    private String nombre;
    private int idEstudiante;
    private double notaMedia;
    private String curso;

    // Constructor
    public Estudiante(String nombre, int idEstudiante, String curso) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.curso = curso;
        this.notaMedia = 0.0; // Inicialización a 0.0
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    // Métodos set
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0.0 && notaMedia <= 10.0) {
            this.notaMedia = notaMedia;
        } else {
            System.out.println("Error: La nota media debe estar entre 0.0 y 10.0.");
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobreescribir toString()
    @Override
    public String toString() {
        return "Estudiante: " + nombre + " (ID: " + idEstudiante + "), Curso: " + curso + ", Nota Media: " + notaMedia;
    }

    // Método aprobado
    public boolean aprobado() {
        return notaMedia >= 5.0;
    }
}