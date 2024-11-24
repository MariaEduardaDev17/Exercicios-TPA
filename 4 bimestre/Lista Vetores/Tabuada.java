import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=5;
		int i,j;
		int a[] = new int[TAM];
		
		System.out.println("Digite 5 números inteiros para o vetor a:");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posição do vetor a: ");
			a[i]= ler.nextInt();
		}
		
		System.out.println("Tabuada do números do vetor a:");
		for(i=0; i<TAM; i++) {
			System.out.println("Tabuada do" + a[i] + ":");
			for(j=1; j<=10; j++) {
				System.out.println(a[i] + "x" + j + "=" + (a[i]*j));
			}
		}
	}
}
