import java.util.*;
public class peso {
	public static void main(String args[]) {
	Scanner ler = new Scanner (System.in);
		double a, p;
		String s, i;
		
		do {
			System.out.println("Digite o sexo:");
			s = ler.next();
			
			System.out.println("Digite a altura:");
			a = ler.nextDouble();
			
			if(s.equalsIgnoreCase("F") || s.equalsIgnoreCase("Feminino")) {
				p = 52+(0.67*(a-152.4));
				System.out.printf("Seu peso ideal � de:\n%.2f",p);		
			}else {
				p = 52+(0.75*(a-152.4));
				System.out.printf("Seu peso ideal � de:\n%.2f",p);
			}
			System.out.println("\n"); /*para pular linha/*/
			System.out.println("Deseja continuar sim ou n�o, s para sim e n para n�o");
			i=ler.next();
		}while(i.equalsIgnoreCase("S"));
		ler.close();
	}
}
