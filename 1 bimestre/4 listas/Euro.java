import java.util.Scanner;
public class Euro {
	public static void main (String[] args) {
    Scanner ler = new Scanner (System.in);
    double euro, cotacao, real;
    cotacao = 5.50;
    System.out.println("Digite o valor em euro:");
    euro = ler.nextDouble();
    real = cotacao*euro;
    System.out.println("Seu valor em real sera:" + real);

    }
}