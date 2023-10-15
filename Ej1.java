import java.util.Scanner;

//Ejercicio Número 1

public class Ej1 {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);
       
     System.out.print("Ingrese un número: ");
     int numero = leer.nextInt();
    
     int cubo = numero * numero * numero;
    
     System.out.println("El cubo de " + numero + " es: " + cubo);

    }
}
