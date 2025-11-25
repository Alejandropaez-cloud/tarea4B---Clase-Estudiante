package tarea4bpaez;

import java.util.InputMismatchException;


public class Estudiante {

    // Atributos privados
    private String nombre;
    private int idEstudiante;
    private double notaMedia;
    private String curso;

    // Constructor

    // Cuando no se especifica un constructopr en la clase 
    // EN el moemnto en el que se crea un constructor en la clase 
    // El constructor por defecto no se crea automaticamente

    // Inicializamod los atributos privados 
    // Creamos constructor para inicializar los atributos privados
    // El constructor siempre va a tener el nombre de la clase creado.
    
    public Estudiante(String nombre, int idEstudiante, String curso) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.curso = curso;
        this.notaMedia = 0.0; // Inicialización a 0.0
    }

    // Métodos getters para consultar los valores
    // de los atributos -- siempre públicos 

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

    // Métodos setters para modificar los valores
    // de los atributos -- siempre públicos 

    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0.0 && notaMedia <= 10.0) {
            this.notaMedia = notaMedia;
        } else {
            throw new InputMismatchException("ERROR"){
            };
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobreescribir toString()
    @Override
    public String toString() {
        return "Estudiante: " + nombre + " (ID: " + idEstudiante + 
        "), Curso: " + curso + ", Nota Media: " + notaMedia;
    }

    // Método aprobado
    public boolean aprobado() {
        return notaMedia >= 5.0;
    }
}