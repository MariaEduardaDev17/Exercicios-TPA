import java.util.Scanner;

public class trocaValor{
	public static void main (String Args[]) {
		Scanner ler = new Scanner (System.in);
		int valorA, valorB, valorC;
		System.out.println("Digite o valorA:");
		valorA = ler.nextInt();
		
		System.out.println("Digite o valorB:");
		valorB = ler.nextInt();
		
		valorC = valorA;
		valorA = valorB;
		valorB = valorC;
		
		System.out.println("O valorA é igual a " + valorA);
		System.out.println("O valorB é igual a " + valorB);
		ler.close();
		
	}
	
}
