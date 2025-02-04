import java.util.Scanner;
public class VetorDeBusca {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			final int TAM = 10;
			int i, b, a[];
			a = new int[TAM];
			
			System.out.println("Armazenamento em vetor A");
			for (i=0; i<TAM; i++) {
				System.out.println("Entre com o "+(i+1)+" valor: ");
				a[i] = ler.nextInt();
				
			}
			
			System.out.println("Entre com um valor para ver se está armazenado: ");
			b = ler.nextInt();
			
			for (i=0; i<10; i++) {
				if (a[i]==b) {
					System.out.println("O valor "+b+ " está armazenado");
				return;
				}
			}
			System.out.println("Não há nenhum valor " + b + " no armazenamento.");
		ler.close();	
	}

}

