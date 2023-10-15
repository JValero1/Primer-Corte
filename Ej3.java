import java.util.Scanner;

//Ejercicio Número 3

public class Ej3 {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);

     System.out.print("Ingrese la base mayor(a): ");
     double BM = leer.nextDouble();

     System.out.print("Ingrese la base menor(b): ");
     double bm = leer.nextDouble(); 

     System.out.print("Ingrese la altura(h): ");
     double altura = leer.nextDouble();
      
     //Nota: No pude aplicar la formula descrita en el sin que me diera error asi que opte por esta mas sencilla
     double area = ((BM + bm) / 2) * altura;

     System.out.println("El área del trapecio es: " + area);
    
    }
}
