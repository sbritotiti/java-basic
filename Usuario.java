//import java.util.Scanner;

public class Usuario {

    private String nombre;
    public String apellidos;
    private int edad;
    private String sexo;
    static int contador = 0;

    //Un constructor con parametros es equivalente a utilizar elmetodo set
    Usuario(String n, int i, String s){
        this.nombre=n;
        this.edad=i;
        this.sexo=s;
        contador++;
        this.apellidos = "Seoane";
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

    public int cantidadUsuarios(){
        return contador;
    }
}
