import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
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
                
                Usuario usuario = new Usuario();
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

                s.close();
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