import java.util.Scanner;
public class VetorGi {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int i, a[], b[];
		a = new int[TAM];
		b = new int[TAM];
		
		//Lendo Vetor A
		for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor: ");
            a[i] = ler.nextInt();
		}
           //verificando pares
         for (i = 0; i < TAM; i++) {
            if(a[i] %2==0) { //se for par bi recebe 1
				b[i] = 1;
			}else {
				b[i] = 0;
			}	
        }
		//Apresentando Vetor B
				System.out.print("B = ["); 
				for(i=0;i<TAM;i++) {
					if (i==9) {
						System.out.print(b[i]); 
					}else {
						System.out.print(b[i]+" "); 
					}
				}
				System.out.print("]\n");
	}
}
