import java.util.Scanner;
public class Vetor14Gi {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Lendo Vetor A
		for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor: ");
            a[i] = ler.nextInt();
		}
		//Lendo Vetor B
		for (i = 0; i < TAM; i++) {
		     System.out.println("Digite o " + (i+1) + "º valor: ");
		     b[i] = ler.nextInt();
		}
           //verificando quem é o maior
         for (i = 0; i < TAM; i++) {
            if(a[i]>b[i]) {
				c[i] = 1;
			}else if(a[i]==b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			} 
        }
		//Apresentando Vetor C
				System.out.print("C = ["); 
				for(i=0;i<TAM;i++) {
					if (i==9) {
						System.out.print(c[i]); 
					}else {
						System.out.print(c[i]+" "); 
					}
				}
				System.out.print("]\n");
	}
}