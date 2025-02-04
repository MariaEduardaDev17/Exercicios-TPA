import java.util.Scanner;
public class Funcionarios {
	public static void main (string args[]) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int i,m,j;
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" salário:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			for (j = i; j < TAM; j++) {
		          b[i] = b[i]+a[j]; 
		   }
		}
		
		for(i=0; i<TAM; i++) {
			m = (a[i]+a[i])/5;
		}
		
		System.out.println("A soma é:" +b[i]);
		System.out.println("A média é:" +m);
	}
}
