//import java.lang.reflect.Array;
import java.util.Scanner;

abstract class Figura {
        double base;
        double altura;
        double calcularArea(){
                return base*altura;
        } 
    }
    
    class Cuadrado extends Figura {
        
        public Cuadrado(double lad1, double lad2) {
            this.base = lad1;
            this.altura = lad2;
        }
    
        /*public double calcularArea() {
            return Math.PI * radio * radio;
        }*/
    }

    class Rectangulo extends Figura{
        
        public Rectangulo(double bas, double altur){
                this.base=bas;
                this.altura=altur;
        }
        
    }

interface Vehiculo {
        default void acelerar(){
                System.out.println("El coche está acelerando.");
        } // Método abstracto
        static void frenar(){
                System.out.println("El coche está frenando.");
            }
}
    
    class Coche implements Vehiculo {
        
    }

    enum Estado {
        ACTIVO("En funcionamiento"),
        INACTIVO("Fuera de servicio"),
        SUSPENDIDO("Temporalmente detenido");
    
        private String descripcion;
    
        // Constructor
        Estado(String descripcion) {
            this.descripcion = descripcion;
        }
    
        // Método para obtener la descripción
        public String getDescripcion() {
            return descripcion;
        }
    }

enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

class Animal{
        void hacerSonido1(){
                System.out.println("El animal hace sonido");
        }
}

class Perro extends Animal{
        void hacerSonido(){
                System.out.println("El perro ladra");
        }
}

public class Main {  
        public static void main(String[] args) {

                Cuadrado cuadrado = new Cuadrado(5, 5);
                System.out.println("Area del Cuadrado: "+cuadrado.calcularArea());
                Rectangulo rectangulo = new Rectangulo(5,2);
                System.out.println("Area del Rectangulo: "+rectangulo.calcularArea());
                Animal animal = new Animal();
                Perro perro = new Perro();
                perro.hacerSonido();
                perro.hacerSonido1();
                
                animal.hacerSonido1();
                 
                Vehiculo coche = new Coche();
                coche.acelerar();
                Vehiculo.frenar();
                //Vehiculo.acelerar();
                

                Estado estado = Estado.ACTIVO;
                System.out.println("Estado: "+estado);
                //System.out.println("Descripcio: "+estado.descripcion);
                System.out.println("Descripcion: "+estado.getDescripcion());
                Dia d = Dia.SABADO;
                System.out.println("El dia es: " + d);
                //int num = 10;
                //double num1 = 10;
                //Probando metodo Overloading
                //int r = methodOverl(num, num);
                //System.err.println(r);
                //double d = methodOverl(num1, num1);
                //System.out.println(d);

                //Recordadndo Recursividad
                //int recurs = Recursivida(5,10);
                //System.out.println(recurs);

                //Utilizando constructor
                //Persona p = new Persona("Salvador");
                //p.mostrarNombre();
                //String messageTest = "messageTest";
                //System.out.println("Hello: " + messageTest);
                Scanner s = new Scanner(System.in);
                /*System.out.print("Numero 1: ");
                int n1 = s.nextInt();
                System.out.print("Numero 2: ");
                int n2 = s.nextInt();
                System.out.println("Suma: " + (n1 + n2));
                System.out.println("Resta: " + (n1 - n2));
                System.out.println("Multiplicacion: " + (n1 * n2));
                if (n2 != 0) {
                        System.out.println("Divi: " + (n1 / n2));
                } else {
                        System.err.println("Divicion por cero no definida");
                }
                System.out.println("");
                System.out.println("");
                System.out.println("------------");

                //Aqui se llama al metodo Potencia
                int h = Potencia(n1, n2);
                System.out.println("La potencia es: " + h);

                //Ahora concatenamos 2 textos
                System.out.println("Teclee un texto");
                String s1 = s.next();
                System.out.println("Teclee otro texto");
                String s2 = s.next();
                System.out.println("La Concatenacion es:" + Concat(s1, s2));
*/
                //SetGet();

                //Llamando a la Clase Usuario
                //String [] array = {"Salva", "Clau", "Cesar"};
                //System.out.println("Teclee el nombre que desea buscar: ");
                //String nombreBuscar = s.next();
                
                //Usando constructor Usuario
                Usuario usuario = new Usuario("Salvador", 34, "M");
                Usuario usuario2 = new Usuario("Clau", 33, "F");
                System.out.println(usuario.apellidos);
                System.out.println(usuario2.apellidos);
                usuario2.apellidos = "Brito";
                System.out.println(usuario.apellidos);
                System.out.println(usuario2.apellidos);
                
                int c = usuario.cantidadUsuarios();
                System.out.println("Cantidad de usuarios: " + c);
                System.out.println("Los datos sin teclear son: " + usuario.getNombre() + " " + usuario.getEdad() + " " + usuario.getSexo());
                usuario.mostrarDatos();
                //int indiceUsuario;
                System.out.println("Teclee el nombre del usuario: ");
                usuario.setNombre(s.next());
                System.out.println("Teclee la edad del usuario: ");
                usuario.setEdad(s.nextInt());
                System.out.println("Teclee el sexo del usuario: ");
                usuario.setSexo(s.next());
                //indiceUsuario = usuario.GetIdUsuario(array, nombreBuscar);
                /*if (indiceUsuario != 0) {
                        System.out.println("Usuario encontrado");
                        System.out.println("El usuario esta en la pocision: " + nombreBuscar + " es: " + indiceUsuario);
                }else{
                        System.out.println("Usuario no encontrado");
                }*/
                
                System.out.println("Los datos tecleados fueron: " + usuario.getNombre() + " " + usuario.getEdad() + " " + usuario.getSexo());
                usuario.mostrarDatos();
                s.close();
        }

        static int Recursivida(int start, int end){
                if (end>start) {
                        //System.out.println("La Suma: " + (n + Recursivida(n-1)));
                        return end + Recursivida(start, end-1);
                        //System.out.println("------" +sumaRec);
                        //return sumaRec;
                }else{
                        return end;
                }
        }

        static int methodOverl(int x, int y){
                return x + y;
        }

        static double methodOverl(double x, double y){
                return x + y;
        }
/*/
        public static int Potencia (int i, int o){
                int c = 1;
                while (o >= 1) {
                   c = c * i;
                   o = o-1;     
                }

                

                return c;
        }
*/
        /*private static String Concat (String s, String p){
                String r=s+p;
                return r;
                
        }*/

}