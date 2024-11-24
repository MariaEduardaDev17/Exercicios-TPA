import java.util.Scanner;
public class ParesEImparesGi {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 20;
		int i,rPar=0,rImpar=19, a[], b[];
		a = new int[TAM];
		b = new int[TAM];
		
		//Lendo vetor A
		for (i=0; i<20; i++) {
			System.out.println("Entre com o "+(i+1)+" valor");
			a[i] = ler.nextInt();
		//Separando os n pares
			if(a[i]%2==0) { //se a divisão for igual a 0 b recebe par. 
				b[rPar] = a[i];
				rPar++;
			}else {
				b[rImpar] = a[i];
				rImpar--; //decrementa
			}	
		}
		//Apresentando Vetor B
		System.out.print("B = ["); 
		for(i=0;i<TAM;i++) {
			if (i==19) {
				System.out.print(b[i]); 
			}else {
				System.out.print(b[i]+" "); 
			}
		}
		System.out.print("]\n");
	
	}
}
