import java.util.Scanner;
public class Intercecao {
	public static void main (String args[]) {
		Scanner ler= new Scanner (System.in);
		final int TAM=10;
		int i=0, j=0, quant=0;//vai armazenar a quantidade de elementos na interseção dos dois vetores
		
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		
		//lendo vetor
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posicão do vetor a: ");
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posição do vetor b: ");
			b[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i]==b[j]) {
					quant++;//Se um elemento de a for igual a um elemento de b, isso significa que há uma interseção, então incrementa-se a variável quant
					break;
				}
			}
		}
		
		int c[] = new int [quant];
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i]==b[j]) {
					c[i]=a[i];
				}
			}
		}
		System.out.print("C = [");
       	       for (i = 0; i < quant; i++) {
          	  System.out.print(c[i]);
               if (i < quant - 1) {
            	  System.out.print(" ");
            }
        }
        System.out.print("]\n");
		ler.close();
	}
}
