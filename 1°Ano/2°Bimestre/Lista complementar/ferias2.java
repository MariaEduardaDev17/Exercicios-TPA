package listacomplementar;
import java.util.Scanner;
public class ferias2 {
	     public static void main (String args []) {
	    	 Scanner ler = new Scanner (System.in);
	    	 double s,abono,t,resposta;
	    	 System.out.println("Digite o valor do seu salario:");
	    	 s = ler.nextDouble();
	    	 
	    	 System.out.println("Voce deseja vender as suas ferias? digite 1 para sim 0 para não");
	    	 
	    	 resposta= ler.nextDouble();
	    	 if (resposta==1) {
	    		 abono=(s/30)*10;
	    		 System.out.println("O abono é de:" +abono);
	    		 t=abono+s;
	    		 System.out.println("o total que ira receber é de" +t);
	    	 }else {
	    		 System.out.println("Voce ira receber" +s+ "de pagamento");
	    	 }
	    	 ler.close();
	     }
}
