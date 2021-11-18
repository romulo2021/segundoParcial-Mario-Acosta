package SegundoParcial;

import java.util.ArrayList;

public class Profesor extends Usuario {
    //atributos
    private ArrayList<Comisiones>comisiones=new ArrayList<Comisiones>();

    {
        comisiones = new ArrayList<Comisiones>();
    }

    public Profesor(int dni, String nombre, String apellido,) {
        super(dni, nombre, apellido);

    }

    public void setComisiones(ArrayList<Comisiones> comisiones) {
        this.comisiones = comisiones;
    }

    public ArrayList<Comisiones> getComisiones() {
        return comisiones;
    }
 public void imprimirComisiones(ArrayList<Comisiones> comisiones){
     for (int i = 0; i < this.comisiones.size(); i++) {
         System.out.println("Comisiones: " + this.comisiones.get(i));

     }
 }



}
