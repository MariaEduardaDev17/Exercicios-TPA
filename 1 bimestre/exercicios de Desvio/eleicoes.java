import java.util.Scanner;
public class eleicoes {
  public static void main (String args[]) {
	  Scanner ler = new Scanner (System.in);
	  int anoe, anon, e;
	System.out.println("Digite o proximo ano de eleição:");
	anoe= ler.nextInt();
	System.out.println("Digite o ano de nascimento do usuario:");
	anon= ler.nextInt();
	e= (anoe - anon);
	System.out.println("Sua idade �:" + e);
	 if(e<16) {
		 System.out.println("Voce ainda n�o tem idade para votar ");
	 } else {
		 System.out.println ("Voce tem idade para votar");
	 }
	  ler.close();
  }
}
