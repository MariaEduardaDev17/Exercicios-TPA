import java.util.Scanner;
public class InvertidoVetor {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[],i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posi��o do vetor a: ");
			a[i]= ler.nextInt();
		}
		System.out.print("A= [");
		for (i=0; i<TAM; i++){
			if(i==9) {
				System.out.print(a[i]);
			}else {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print("]\n");
		 
		System.out.print("B= [");
		for (i=9; i>-1; i=i-1) { //o laço percorre o array de trás para frente.
			b[i]= a[i];
			if(i==0) {
				System.out.print(b[i]);
			}else {
				System.out.print(b[i] + " ");
			}
		}
		System.out.print("]\n");
		ler.close();
	}
}