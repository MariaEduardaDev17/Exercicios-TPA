package listacomplementar;
import java.util.Scanner;
public class destino3 {
   public static void main (String args []) {
	   Scanner ler = new Scanner (System.in);
	   int d,destino, t;
	   System.out.println("Digite o destino, 1 para ilha bela e 2 para fernando de noronha:");
	   destino = ler.nextInt();
	   System.out.println("Digite quandos dias de viagem:");
	   d = ler.nextInt();
	   
	   if (destino == 1) {
		   if (d<=5) {
			   t=d*240;
			   System.out.println("O total a pagar é de:"+t);
		   }else if(d<=10) {
			  t=(d*220)+130;
			  System.out.println("O total a pagar é de:"+t);
		   }else {
			  t=(d*210)+150;
			  System.out.println("O total a pagar é de:"+t);
		   }
		   
	   }else {
		   if (d<=5) {
			   t=(d*400)+100;
			   System.out.println("O total a pagar é de:"+t);
		   }else if (d<=10) {
			   t=(d*410)+150;
			   System.out.println("O total a pagar é de:"+t);
		   }else {
			   t=(d*420)+200;
			   System.out.println("O total a pagar é de:"+t);
		   }
	   }
           ler.close();
   }
} 