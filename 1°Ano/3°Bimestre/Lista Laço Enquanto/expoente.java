import java.util.Scanner;
public class expoente {
public static void main (String args []) {
	Scanner ler = new Scanner (System.in);
	int i=0, b, e, r=1;
	
	System.out.println("Digite a base: ");
	b = ler.nextInt();
	System.out.println("Digite o expoente: ");
	e = ler.nextInt();

	while(i<e) {
		r*=b;
		i++;
	}
	System.out.println("A potência  de: " +b+ " elevado a: " +e+ "é igual a: " +r);
	ler.close();
}
}
