//import java.util.Scanner;

public class Usuario {

    private String nombre;
    private int edad;
    private String sexo;

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

    /*public static Usuario(String s, int i, String c){
        nombre = s;
        edad = i;
        sexo = c;
    }*/

    /*public int GetIdUsuario(String Array[], String s){
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
            System.out.println(s);
            if (Array[i].equals(s)) {
                
                return i+1;
            }
        }
        
        return 0;
    }*/
}
