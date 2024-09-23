package listaCaderno;
import java.util.Scanner;
public class salaarioDepe {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double s, d, v, sf;
		System.out.println("Digite o salario:");
		s = ler.nextDouble();
		System.out.println("Digite o numero de dependentes:");
		d = ler.nextDouble();
		v = d*55.0;
		sf = v + s;
		System.out.println("O salario final sera " + sf);
		ler.close();

	}

}