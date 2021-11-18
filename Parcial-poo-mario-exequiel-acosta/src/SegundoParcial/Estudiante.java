package SegundoParcial;



import java.util.ArrayList;

public class Estudiante extends Usuario {
    //atributos
    private String carrera;
    private ArrayList<MateriasAprobadas> materiasAprobadas = new ArrayList<MateriasAprobadas>();
    private ArrayList<MateriasInscriptas> materiasInscriptas = new ArrayList<MateriasInscriptas>();



    {
        materiasInscriptas = new ArrayList<MateriasInscriptas>();
    }

    //constructor

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }



    //metodos setter y getter
    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
public void setMateriasAprobadas(ArrayList<MateriasAprobadas> materiasAprobadas){
        this.materiasAprobadas=materiasAprobadas;
}

    public ArrayList<MateriasAprobadas> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasInscriptas(ArrayList<MateriasInscriptas> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    public ArrayList<MateriasInscriptas> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    //metodos
    public void imprimirMateriasAprobadas(ArrayList<MateriasAprobadas> materiasAprobadas) {
        for (int i = 0; i < this.materiasAprobadas.size(); i++) {
            System.out.println("materias aprobadas: " + this.MateriasAprobadas.get(i));
        }
        public void imprimirMateriasInscriptas(ArrayList<MateriasInscriptas> materiasInscriptas){
            for (int i = 0; i < this.materiasInscriptas.size(); i++) {
                System.out.println("materias inscriptas: " + this.MateriasInscriptas.get(i));
            }
        }
    }
}




