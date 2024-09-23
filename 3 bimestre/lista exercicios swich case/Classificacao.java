import java.util.Scanner;
public class Classificacao {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int id;
		System.out.println("Digite a idade do aluno:");
		id = ler.nextInt();
		switch (id) {
		case 6:
			System.out.println("Categoria: Dente de leite");
			break;
		case 7:
			System.out.println("Categoria: Júnior");
			break;
		case 8:
			System.out.println("Categoria: Júnior max");
			break;
		case 9:
			System.out.println("Categoria: Júnior master");
			break;
		case 10:
			System.out.println("Categoria: Master");
			break;
		default:
			System.out.println("A escola não admite alunos de outras idades");
			break;
		}
	}
}
