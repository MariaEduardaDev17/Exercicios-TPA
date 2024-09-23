package listacomplementar;
import java.util.Scanner;
public class distancia {
    public static void main(String args []) {
    	Scanner ler = new Scanner (System.in);
    	double km, h, b, b1, b2;
    	System.out.println("Digite a distancia percorrida pelo táxi:");
    	km = ler.nextDouble();
    	System.out.println("Digite o horário que o táxi foi pedido:");
    	h = ler.nextDouble();
    	System.out.println("Digite a quantidade de bagagens:");
    	b = ler.nextDouble();
        if (b>0) {
        	if (h>=6 && h<=20) {
        		b1 = (km*2.75)+ 4.50 +(b*2.75);
        		System.out.println("Sua bandeira é 1, o total a pagar é de:" + b1);
       }else {
            b2 = (km*3.58)+ 5.65 +(b*2.75);
        	System.out.println("Sua bandeira é 2, o total a pagar é de:" + b2);
        	}
        }if (b==0) {
        	if (h>=6 && h<=20) {
            b1 = (km*2.75)+ 4.50;
            System.out.println("Sua bandeira é 1, o total a pagar é de:" + b1);
        }else {
        	b2 = (km*3.58)+ 5.65;
       		System.out.println("Sua bandeira é 2, o total a pagar é de:" + b2);
        	}
        }
        ler.close();
    }
}
