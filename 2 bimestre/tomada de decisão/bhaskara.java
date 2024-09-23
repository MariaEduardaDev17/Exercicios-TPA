import java.util.Scanner;
public class bhaskara {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double a, b, c, delta, x, x1, x2;
		System.out.println("Digite o valor de a:");
		a = ler.nextDouble();
		System.out.println("Digite o valor de b:");
		b = ler.nextDouble();
		System.out.println("Digite o valor de c:");
		c = ler.nextDouble();
		delta = (b*b) - 4 * a * c;
		System.out.println("O valor de delta é igual a:" + delta);
		if (delta>0) {
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("Exitem duas raizes para esta equação:" + x1 + "," + x2);
		}else if (delta==0) {
			x = -b/(2*a);
			System.out.println("Só exite uma raiz para esta equação:" + x);
		}else {
			System.out.println("Não exite raizes reais para esta equação");
		}
		ler.close();
			
	}

}
