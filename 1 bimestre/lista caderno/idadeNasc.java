package listaCaderno;
import java.util.Scanner;

public class idadeNasc {
	public static void main (String args [] ) {
		Scanner ler = new Scanner(System.in);
		double an, aa, valor;
		//leia(an)
		System.out.println("digite o ano de nascimento do usuario:");
		an=ler.nextDouble();
		//leia (aa)
		System.out.print("Digite o ano atual:");
		aa=ler.nextDouble();
		valor= (aa-an);
		//escreva a idade do usuario
		System.out.println("A idade sera:"+ valor);
		ler.close();

	
	}

}
