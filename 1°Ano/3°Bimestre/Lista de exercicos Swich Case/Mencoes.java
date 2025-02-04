import java.util.Scanner;
public class Mencoes {
	public static void main (String agrs []) {
		Scanner ler = new Scanner (System.in);
		int mb, b, r, i, total, media;
		String opcao;
		
		System.out.println("digite a quantidade total de alunos:");
		total= ler.nextInt();

		System.out.print("Digite o total de alunos que tiraram mb na sala:");
		 mb = ler.nextInt();
		
		 System.out.print("Digite o total de alunos que tiraram b na sala:");
		 b = ler.nextInt();
		
		 System.out.print("Digite o total de alunos que tiraram r na sala:");
		 r = ler.nextInt();
		
		 System.out.print("Digite o total de alunos que tiraram i na sala:");
		 i = ler.nextInt();
		
		 total = mb+b+r+i;
		 
		 System.out.println("Escolha a porcentagem que deseja ver da nota");
		 opcao = ler.next();
		 
		 switch(opcao) {
		  case "mb":
			  mb = (mb*100)/total;
			  System.out.println("essa é a porcentagem de alunos que tiraram mb " + mb + "%");
			  break;
		  case "b":
			  b = (b*100)/total;
				  System.out.println("essa é a porcentagem de alunos que tiraram b " + b + "%");
				  break;
		  case "r":
			  r = (r*100)/total;
				  System.out.println("essa é a porcentagem de alunos que tiraram r " + r + "%");
				  break;
		  case "i":
			  i = (i*100)/total;
				  System.out.println("essa é a porcentagem de alunos que tiraram i " + i + "%");
				  break;
		  default:
				System.out.println("A escola não admite outras notas");
				break;
		 }
		 
		 
	}
}
