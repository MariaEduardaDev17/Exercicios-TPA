import java.util.Scanner;
public class tabuada {
   public static void main (String [] args) {
	   Scanner ler = new Scanner (System.in);
	   int i = 1, n, r;
	   System.out.println("Digite o n�mero desejado:");
	   n = ler.nextInt();
	   while (i<11) {
		   r = n*i;
           System.out.println(n+"x"+i+"="+r);
		   i = i+1;
	   }
	   ler.close();
   }
}
