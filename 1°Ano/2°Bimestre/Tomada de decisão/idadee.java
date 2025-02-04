import java.util.Scanner;
public class idadee {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade,u,a;
		System.out.println("Digite o ano de nascimento do usuario:");
		u = ler.nextInt();
		System.out.println("Digite o ano atual:");
		a = ler.nextInt();
		idade = (a-u);
		System.out.println("Idade do usuario:" + idade);
		if (idade<10) {
			System.out.println("criança");
		}else if (idade<18) {
			System.out.println("adolescente");
		}else if (idade<60) {
			System.out.println("adulto");
		}else {
			System.out.println("idoso");
		}
		ler.close();	
	}
}
