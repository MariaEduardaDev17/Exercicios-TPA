package listaCaderno;
import java.util.Scanner;
public class mediaAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, media;
		System.out.println("Digite a primeira nota do aluno:");
		n1 = ler.nextInt();
		System.out.println("Digite a segunda nota do aluno:");
		n2 = ler.nextInt();
		media = (n1+n2)/2;
		System.out.println("A media do aluno foi "+ media);
		ler.close();		
		
	}
}