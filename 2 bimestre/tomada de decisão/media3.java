package tomadadeDecisão2;
import java.util.Scanner;
public class media3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, m, nn, nm;
		
		System.out.println("Digite a primeira nota:");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota:");
		n2 = ler.nextDouble();
		m = (n1+n2)/2;
		if (m<3) {
			System.out.println("O aluno esta reprovado");
	   }else if (m>=6) {
			System.out.println("O aluno esta aprovado");
       }else {
	      System.out.println("O aluno esta em exame");
		 System.out.println("escreva a nova nota do aluno: ");
			nn = ler.nextDouble();
			nm = (nn+m)/2;
			if (nm>=6) {
				System.out.println("O aluno esta aprovado");
			}else {
				System.out.println("O aluno esta reprovado");
			}
		}
		ler.close();
	}
}
