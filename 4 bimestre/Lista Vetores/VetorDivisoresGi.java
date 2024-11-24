import java.util.Scanner;
public class VetorDivisoresGi{
	public static void main(String[] args) {
    	Scanner ler = new Scanner (System.in);
    	final int TAM=10;
    	int i,j,divisores, a[];
    	a = new int[TAM];
    	
    	 // Lendo o vetor A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            a[i] = ler.nextInt();
        }
        
	    for (i = 0; i < TAM; i++) {
	        System.out.print("Divisores de " + a[i] + ": ");
            for (j = 1; j <=TAM; j++) {//verifica se cada número j é um divisor de a[i].
                if (a[i] % j == 0) {
                	 System.out.print(j + " ");
                }
            }
            System.out.println();
	    }
	}
