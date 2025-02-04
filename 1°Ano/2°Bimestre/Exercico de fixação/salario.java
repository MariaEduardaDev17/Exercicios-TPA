import java.util.Scanner;
public class salario {
	public static void main (String args[]) {
		Scanner ler= new Scanner (System.in);
		double s;
		System.out.println("Digite o valor do salario:");
		s = ler.nextDouble();
		if(s>= 1302.00) {
			System.out.println("O salario esta acima do salario minimo.");
		} else {
			System.out.println("O salario esta abaixo do salario minimo.");
		}
		ler.close();
	} 
}

