import java.util.Scanner;

//Ejercicio Número 2

public class Ej2 {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);
        
     System.out.print("Ingrese un número negativo: ");
     int numeron = leer.nextInt();
            
     int positivo = Math.abs(numeron);
            
     System.out.println("El número que ingresó es " + numeron + " y su valor positivo es: " + positivo);
    
    }
}
