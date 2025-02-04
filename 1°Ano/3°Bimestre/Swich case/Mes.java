import java.util.Scanner;
public class Mes {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int m;
		System.out.println("Digite o número equivalente ao mes:");
		m = ler.nextInt();
		switch(m) {
		case 2:
			System.out.println("28 dias");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("31 dias");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("30 dias");
			break;
		default:
			System.out.println("Número de mes invalido");
			break;
		}
	}
}
