import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                String messageTest = "messageTest";
                System.out.println("Hello: " + messageTest);
                Scanner s = new Scanner(System.in);
                System.out.print("Numero 1: ");
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
                s.close();
        }

}