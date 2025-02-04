package listaCaderno;
import java.util.Scanner;
   public class Projet_ {
   public static void main (String arg[]) {
        Scanner ler =new Scanner(System.in);
        double numero1, numero2, numero3,resultado;
        System.out.println ("digite o primeiro numero :");
        numero1 = ler.nextDouble();		
        System.out.println ("digite o segundo numero :");
        numero2= ler.nextDouble();
        System.out.println ("digite o teceiro numero :");
        numero3= ler.nextDouble();
        resultado=(numero1+numero2+numero3);
        System.out.println (" o resultado é: " + resultado);
        ler.close();  
   }
	
}

