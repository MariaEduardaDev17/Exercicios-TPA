package listaCaderno;
import java.util.Scanner;
public class convertDias {
	
	public static void main(String[] args) {
		Scanner cleiton = new Scanner (System.in);
		int d, meses, anos;
		System.out.println("Digite os dias:");
		d = cleiton.nextInt();
		meses = d/30;
		anos = d/365;
		System.out.println("A quantidade de meses equivalente � " + meses);
		System.out.println("A quantida de anos equivalente � " + anos);
		cleiton.close();
	}

}