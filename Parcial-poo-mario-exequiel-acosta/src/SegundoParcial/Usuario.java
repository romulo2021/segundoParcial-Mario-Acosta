package SegundoParcial;

public abstract class Usuario {
    //atributos
    private int dni;
private String nombre;
private String apellido;
//constructor
    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
//metodos setter y getter
    public void setDni(int dni){
        this.dni=dni;
    }
public int getDni(){
        return dni;
}
public void setNombre(String nombre){
        this.nombre=nombre;
}
public String getNombre(){
        return nombre;
}
public void setApellido(String apellido){
        this.apellido=apellido;
}

    @Override
    public String toString() {
        return "el dni del"+" "+this.getClass() +" "+ this.getNombre()+" es "+ this.getDni();
    }
}
