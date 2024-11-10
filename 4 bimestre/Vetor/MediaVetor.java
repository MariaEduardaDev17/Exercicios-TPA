import java.util.Scanner;
public class MediaVetor {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[],c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite a "+(i+1)+" nota:");
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite a "+(i+1)+" nota:");
			b[i]= ler.nextInt();
		}
		
		//media
		for(i=0; i<TAM; i++) {
			c[i]= (a[i]+b[i])/2;
		}
		
		//Apresentação
		System.out.print("Média = [");
		for(i=0; i<TAM; i++) {
			if (i==9) {
				System.out.print(c[i]);
			}else {
				System.out.print(c[i]+" ");
			}
		}
		System.out.print("]\n");
		
		//apresentando o maior
		
  }
}