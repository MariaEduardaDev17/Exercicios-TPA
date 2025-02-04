package listacomplementar;
import java.util.Scanner;

public class valoresconvertidos2 {
    public static void main(String args[]) {
    		Scanner ler = new Scanner(System.in);
    	    double d, c, reais, euro, dolar, pa;
    	    String destino;
    	      System.out.println("Digite o destino da sua viagem:");
              destino = ler.next();
              System.out.println("Digite a quantia em dinheiro que ir� levar:");
              d = ler.nextDouble();
              System.out.println("Digite a cotação do pais:");
              c = ler.nextDouble();
              if (destino.equalsIgnoreCase("Brasil")) {
            	  reais = d*1;
            	  System.out.println("Sua viagem é nacional, o valor é:" + reais);
         	  }else if (destino.equalsIgnoreCase("Europa")){
            	  euro = d/c;
            	  System.out.printf("Sua viagem é europeia, o valor convertido é de: %.2f\n",euro);
              }else if (destino.equalsIgnoreCase("Norte-Americana")) {
            	  dolar = d/c;
            	  System.out.printf("Sua viagem é norte-americana, o valor convertido é de: %.2f\n",dolar);
              }else {
            	  pa = d*c;
            	  System.out.printf("Sua viagem é sul-america, o valor convertido é de: %.2f\n",pa);
              }
              ler.close();        
    }
}