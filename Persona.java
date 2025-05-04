public class Persona {
    String nombre;

    //Constructor
    Persona(String nombre){
        this.nombre=nombre;
    }

    void mostrarNombre(){
        System.out.println("El nombre es: " +nombre);
    }
}
