import java.util.Scanner;
public class peso {
	public static void main(String args[]) {
		
		Scanner ler= new Scanner(System.in);
		Double p,a,imc;
		System.out.println("digite o peso:");
		p= ler.nextDouble();
		System.out.println("digite a altura:");
		a= ler.nextDouble();
		imc = (p/(a*a));
		System.out.printf("seu imc é: %.2f \n", imc);
		if (imc<18.5) { 
			System.out.println("Excesso de Magreza");
		} else if (imc<=25) {
			System.out.println("peso normal");
		} else if (imc>25) {
			System.out.println("Excesso de peso");
		} else if (imc>30) {
			System.out.println("Obesidade grau I");
		} else if (imc>35) {
			System.out.println("Obesidade grau II ");
		} else {
			System.out.println("Obesidade grau III");
		}
		ler.close();
	}

}
