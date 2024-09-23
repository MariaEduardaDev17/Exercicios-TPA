import java.util.Scanner;
public class fatorial {
public static void main (String [] args) {
	Scanner ler = new Scanner (System.in);
	int i=1, n, r=1;
	
	System.out.println("Digite o número que deseja ver o fatorial:");
	n = ler.nextInt();
	
	while(i<=n) {
		r*=i;
		i++;
	}
	System.out.println("O fatorial de " +n+"é igual a: " +r);
}
}
