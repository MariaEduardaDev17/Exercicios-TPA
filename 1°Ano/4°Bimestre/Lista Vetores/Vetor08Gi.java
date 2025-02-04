import java.util.Scanner;
public class Vetor08Gi {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int TAM = 10;
        int i, j, a[], b[];
        a = new int[TAM];
        b = new int[TAM];
        
        // Lendo o vetor A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            a[i] = ler.nextInt();
        }

        // Calculando o vetor B
        for (i = 0; i < TAM; i++) {
            for (j = i; j < TAM; j++) {//quando i = 0 ele soma tudo, quando i = 1, ele soma do segundo elemento em diante, e assim por diante.
                b[i] = b[i]+a[j]; 
            }
        }

        // Apresentando o vetor B
        System.out.print("B = ["); 
        for (i = 0; i < TAM; i++) {
            if (i == 9) {
                System.out.print(b[i]);  
            } else {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println("]");
    }
}
