import java.util.Scanner;

//Ejercicio Número 4

public class Ej4 {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese los metros a convertir: ");
     double metros = leer.nextDouble();

     // Metros a pies (Nota: el calculo de metros a pies proviene de la regla de tres aplicada en base a sus valores en pulgadas)
     double mepies = metros * 39.2725; 

     System.out.println(metros + " metros son " + mepies + " pies.");

     // Pies a pulgadas
     double piesp = mepies * 12;

     System.out.println(mepies + " pies son " + piesp + " pulgadas.");
    
    }
}
