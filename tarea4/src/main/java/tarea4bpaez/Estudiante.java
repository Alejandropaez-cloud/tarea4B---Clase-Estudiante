package tarea4bpaez;

import java.lang.reflect.Constructor;

public class Estudiante {

       // Atributos Privados.
        private String nombre;
        private int idEstudiante;
        private double notaMedia;
        private String curso;

        // Constructor (Inicializa loa atributos privados)
        public Estudiante (String nombre, int idEstudiante, String curso ){
            this.nombre = nombre;
            this.idEstudiante = idEstudiante;
            this.curso = curso;
            this.notaMedia = 0.0;
        }  

        // METODOS GET 

        public String getNombre(){
            return nombre;
        }
        public int getidEstudiante(){
            return idEstudiante;
        }
        public double getnotaMedia(){
            return notaMedia;
        }
        public String getsurso(){
            return curso;
        }
        
        // METODS SET



    
}
