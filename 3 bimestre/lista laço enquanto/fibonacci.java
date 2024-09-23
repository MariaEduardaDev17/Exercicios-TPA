import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int primeiro = 0, segundo = 1, i = 1, next;
        
        System.out.print("escolha posição: ");
        int n = ler.nextInt();

        if (n <= 0) {
            System.out.println("A posição tem que estar acima de zero");  
        } else {
            System.out.println("sequência de Fibonacci até a " + n + "º posição:");

            while (i <= n) {
                System.out.print(primeiro + " ");

                next = primeiro + segundo;
                primeiro = segundo;
                segundo = next;

                i++;
            }
        }

        ler.close();
    }
}
