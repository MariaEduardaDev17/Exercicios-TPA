package tomadadeDecisão2;
import java.util.Scanner;
public class nomeId {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		String nome, nomevelho, nomenovo;
		int id, idadenovo, idadevelho;
		System.out.println("Digite o nome do primeiro usúario:");
		nome = ler.next();
		System.out.println("Digite a idade do primeiro usúario:");
		id = ler.nextInt();
		nomevelho= nome;
		idadevelho= id;

		nomenovo= nome;
		idadenovo= id;
		
		System.out.println("Digite o nome do segundo usúario: ");
		nome = ler.next();
		System.out.println("Digite a idade do segundo usúario: ");
		id = ler.nextInt();
		if (id>idadevelho) {
			nomevelho= nome;
			idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}
		 System.out.println("Digite o nome do terceiro usúario: ");
		 nome = ler.next();
		 System.out.println("Digite a idade do terceiro usúario :");
		 id = ler.nextInt();
	     if (id>idadevelho){
		  nomevelho= nome;
		  idadevelho= id;
	   }else if (id<idadenovo) {
		  nomenovo= nome;
		  idadenovo= id;
	   }
	    System.out.println("Digite o nome do quarto usúario: ");
		nome = ler.next();
		System.out.println("Digite a idade do quarto usúario: ");
		id = ler.nextInt();   
		if (id>idadevelho){
		  nomevelho= nome;
	      idadevelho= id;
		}else if (id<idadenovo) {
			  nomenovo= nome;
			  idadenovo= id;
	    }
		 System.out.println("Digite o nome do quinto usúario: ");
		 nome = ler.next();
		 System.out.println("Digite a idade do quinto usúario: ");
		 id = ler.nextInt();   
		 if (id>idadevelho){
			  nomevelho= nome;
		      idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}
		 System.out.println("O usúario mais velho é:"+nomevelho+".");
		 System.out.println("Sua idade é: "+idadevelho+"Anos.");
		 
		 System.out.println("O usúario mais novo é:"+nomenovo+".");
		 System.out.println("Sua idade é: "+idadenovo+"Anos.");
		 ler.close();
}
}