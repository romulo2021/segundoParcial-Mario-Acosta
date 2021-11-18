package SegundoParcial;

public class Main {
    public static void main(String[]args){
        Profesor profesor=new Profesor(100,"jhon","doe");
       Estudiante estudiante=new Estudiante(31859478,"Mario","Acosta","Analista");
        estudiante.getMateriasAprobadas().add("poo","ux","sistemas");
        estudiante.getMateriasInscriptas().add("programacion avanzada","web3");
        System.out.println("materias aprobadaas: "+estudiante.getMateriasAprobadas());
        System.out.println("materias inscriptas: "+estudiante.getMateriasInscriptas());







    }




}
