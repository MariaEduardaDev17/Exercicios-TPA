import java.util.Scanner;
public class imparOUpar {
	public static void main (String args[]) {
	  Scanner ler = new Scanner (System.in);
	  int resto, n1;
     System.out.println("insira o numero : ");
     n1 = ler.nextInt();
     n1 = n1%2;//verifica se o número é par
     if(n1!=0) {
    	 System.out.println("impar");
     } else { 
    	 System.out.println("par");
     }
     ler.close();
	  
}
}