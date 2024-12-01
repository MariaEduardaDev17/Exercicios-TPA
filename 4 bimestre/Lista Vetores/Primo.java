import java.util.Scanner;
public class Primo {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int i, j, divisor;
		int a[] = new int[TAM];
		
		System.out.println("Digite 10 números inteiros para o vetor a:");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" numero: ");
			a[i]= ler.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
	            int n = a[i]; 
	            divisor = 0; 
	            
	        if (n < 2) {
	      	  System.out.println(n + " não é primo.");
		}else {
			for(j=2; j<a[i]; j++) {
				if (a[i] % j==0) {
					divisor = 1;
				} 
			}
			if(divisor==0) {
				System.out.println(n +" é primo.");
			}else {
				System.out.println(n +" não é primo.");
			}
				
		   }
		}
	}
}
