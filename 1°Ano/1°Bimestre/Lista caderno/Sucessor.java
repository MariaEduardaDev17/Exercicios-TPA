package listaCaderno;
import java.util.Scanner;
  public class Sucessor {
  public static void main (String arg[]) {
     Scanner ler= new Scanner (System.in);
     int v, antecessor, sucessor;
     System.out.println("digite o numero");
     v = ler.nextInt();
     antecessor = v-1;
     sucessor = v+1;
     System.out.println("o sucessor do seu numero" + sucessor);
     System.out.println("o antecessor do seu numero" + antecessor);
 
      } 
}
  