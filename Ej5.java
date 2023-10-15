import java.util.Scanner;

//Ejercicio Número 5

public class Ej5 {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese los grados Celsius a convertir: ");
     double cel = leer.nextDouble();
     double fah;
 
     fah = (cel * 9/5) + 32;
 
     System.out.println(cel + " grados centígrados°C = " + fah + " grados Fahrenheit°F");

    }
}
