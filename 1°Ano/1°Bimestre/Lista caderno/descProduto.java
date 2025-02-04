package listaCaderno;
import java.util.Scanner;
public class descProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v, desc, nv;
		System.out.println("Digite o valor do produto:");
		v = ler.nextDouble();
		desc = v/100*5;
		nv = v-desc;
		System.out.println("O preço final do produto é" + nv);
		ler.close();
	}
}