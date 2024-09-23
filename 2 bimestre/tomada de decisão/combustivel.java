import java.util.Scanner;
public class combustivel {

	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		Double t,dp,consumo;
		System.out.println("Digite a capacidade do tanque do carro:");
		t = ler.nextDouble();
		System.out.println("Digite qual foi a distancia percorrida em km:");
		dp = ler.nextDouble();
		consumo = (dp/t);
		System.out.println("o gasto medio do veiculo em km por litro foi de:" + consumo);
		if (consumo>10/1) {
			System.out.println("economico");
		}else {
			System.out.println("Não economico");
		}
		ler.close();
	}

}
