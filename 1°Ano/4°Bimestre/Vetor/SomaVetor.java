import java.util.Scanner;
public class SomaVetor {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=5;
		int a[], b[],c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		//lendo vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" Valor do vetor A:");
			a[i]= ler.nextInt();
		}
		//Lendo vetor B
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" Valor do vetor B:");
			b[i]= ler.nextInt();
			c[i]= a[i]+b[i];
		}
		//Apresentando vetores
		
		//Apresentando vetor A
		System.out.print("A = [");
		for(i=0; i<TAM; i++) {
			if (i==4) {
				System.out.print(a[i]);
			}else {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]\n");

		//Apresentando vetor B
		System.out.print("B = [");
		for(i=0; i<TAM; i++) {
			if (i==4) {
				System.out.print(b[i]);
			}else {
				System.out.print(b[i]+" ");
			}
		}
		System.out.print("]\n");
		
		//Apresentando vetor C
		System.out.print("C = [");
		for(i=0; i<TAM; i++) {
			if (i==4) {
				System.out.print(c[i]);
			}else {
				System.out.print(c[i]+" ");
			}
		}
		System.out.print("]\n");
		ler.close();
		
	}
}
