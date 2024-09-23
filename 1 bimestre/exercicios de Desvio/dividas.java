import java.util.Scanner;
public class dividas {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double s, d, sobra;
		System.out.println("digite o salario:");
		s = ler.nextDouble();
		System.out.println("digite o valor de suas dividas:");
		d = ler.nextDouble();
		sobra = (s-d);
		if (sobra<0) {
				System.out.println("falta" + sobra);
		} else  {
			System.out.println("sobra" + sobra);
		}
		ler.close();
}
}