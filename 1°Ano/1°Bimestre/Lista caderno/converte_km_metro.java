import java.util.Scanner;
public class converte_km_metro {
	 public static void main (String arg[]) {
	 Scanner ler = new Scanner (System.in);
     double metro,quilometro;
     System.out.println("Digite o valor em metros:");
     metro= ler.nextDouble();
     quilometro=metro/1000;
     System.out.println("O valor convertido em quilometros é de:"+quilometro);
     ler.close();
	 }
}
