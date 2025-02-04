import java.util.Scanner;
public class Diferenca {
		public static void main (String args[]) {
			Scanner ler= new Scanner (System.in);
			final int TAM=10;
			int i=0, j, quant=0;
			
			int a[] = new int [TAM];
			int b[] = new int [TAM];
			int c[] = new int [TAM];
			
			//lendo vetor
			for(i=0; i<TAM; i++) {
				System.out.println("Digite o "+(i+1)+" posição do vetor a: ");
				a[i]= ler.nextInt();
			}
			
			for(i=0; i<TAM; i++) {
				System.out.println("Digite o "+(i+1)+" posição do vetor b: ");
				b[i]= ler.nextInt();
			}
			
			for(i=0; i<TAM; i++) {
				for(j=0; j<TAM; j++) {
					if(a[i]==b[j]) {
						break;
					}
				}
				if(j==10) {
					c[quant++] = a[i];
				}
			}
			System.out.print("C:");
			for(i=0; i<quant; i++) {
				 System.out.print( c[i] + " ");
			}
			
			ler.close();
	}
}

