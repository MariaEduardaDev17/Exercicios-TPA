package listaCaderno;
import java.util.Scanner;
public class produtoDesc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double p,d, vf;
		System.out.println("Digite o preço do produto:");
		p = ler.nextDouble();
		System.out.println("Digite o desconto:");
		d = ler.nextDouble();
		vf = p-(d/100*p);
		System.out.println("O preço final do produto é " + vf);
		ler.close();
	}

}
