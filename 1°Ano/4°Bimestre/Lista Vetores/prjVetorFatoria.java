import java.util.Scanner;
public class prjVetorFatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int i, fato;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor para saber o fatorial: ");
            a[i] = ler.nextInt();
        }
        
        for (i = 0; i < TAM; i++) {
            fato = 1;
            for (int j = 1; j <= a[i]; j++) {
                fato = fato*j; //cálculo do fatorial
            }
            b[i] = fato;
        }
        
        System.out.print("A = [");
		
		//Apresentando A
		for(i=0; i<TAM; i++){ 
			if (i==9) {
				System.out.print(a[i]); 
			}else {
				System.out.print(a[i]+" "); 
			}
		}
		System.out.print("]\n");
		
		//Apresentando B
		System.out.print("B = [");
		for(i=0; i<TAM; i++){ 
			if (i==9) {
				System.out.print(b[i]); 
			}else {
				System.out.print(b[i]+" "); 
			}
		}
		System.out.print("]\n");
        
        ler.close(); 
    }
}