//import java.util.Scanner;

public class Usuario {

    private String nombre;
    private int edad;
    private String sexo;

    //Un constructor con parametros es equivalente a utilizar elmetodo set
    Usuario(String n, int i, String s){
        this.nombre=n;
        this.edad=i;
        this.sexo=s;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String s){
        this.nombre = s;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    void mostrarDatos(){
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Sexo: "+sexo);
    }
}
