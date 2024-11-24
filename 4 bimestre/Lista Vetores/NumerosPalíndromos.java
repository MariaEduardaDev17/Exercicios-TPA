import java.util.Scanner;
public class NumerosPalíndromos {
	public static void main (String Args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int i;
		int a[] = new int[TAM];
		
		System.out.println("Escreva os números:");
				
		for(i=0; i<TAM; i++) {
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM/2; i++) { //Quando i = 0, a[i] é o primeiro elemento (a[0]) e a[TAM - 1 - i] é o último elemento (a[9]).
			if(a[i] != a[TAM-1-i]) {
				System.out.println("Não é um palindromo");
				break;
			}
		}
		
		if(i==TAM/2) {// verifica se o laço chegou até a metade sem encontrar diferenças.
			System.out.println("É um palindromo");
		}
		ler.close();
	}
}
