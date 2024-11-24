import java.util.Scanner;
public class VetoresOrdenados {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], c[],i, j, temp /*Variável temporária usada para realizar as trocas durante a ordenação*/;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posi��o do vetor a: ");
			a[i]= ler.nextInt();
		}
		for (i=0; i<TAM; i++) {
			b[i]= a[i];
			c[i]= a[i];
		}
		/*vetor b crescente*/
		for (i=0; i < TAM - 1; i++) {
			for(j=i+1; j<TAM; j++)  {
				if(b[i]>b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		/*vetor c decrescente*/
		for (i=0; i<TAM-1; i++) {
			for(j=i+1; j<TAM; j++) {
				if(c[i]<c[j]) /*invertido*/ {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		/*a*/
		System.out.print("Vetor a:");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		/*b*/
		System.out.print("Vetor b (ordem crescente):");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		/*c*/
		System.out.print("Vetor c (ordem decrescente):");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
}
}