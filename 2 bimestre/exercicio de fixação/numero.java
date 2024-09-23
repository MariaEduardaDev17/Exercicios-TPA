import java.util.Scanner;
public class numero {
	public static void main (String args[]) {
     Scanner ler = new Scanner (System.in);
     double n;
     System.out.println("Digite o numero:");
     n = ler.nextDouble();
     if (n<0) {
    	 System.out.println("Seu numero é negativo.");
     }else if (n==0) {
    	 System.out.println("Seu numero é neutro.");
     }else {
    	 System.out.println("Seu numero é positivo.");
     }
    	ler.close();
}
}
