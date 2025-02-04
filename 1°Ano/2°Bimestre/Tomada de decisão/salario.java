package tomadadeDecisão2;

import java.util.Scanner;
public class salario {
	
	public static void main(String args[]) {
		Scanner ler= new Scanner(System.in);
			Double s,irpf; 
				System.out.println("digite o salario:");
				s = ler.nextDouble();
			 
			if(s<=1434.59) {
				 irpf=(double) 0;
				 System.out.println("não há desconto");
			 } else if(s<=2150.00) {
			     irpf = (s*7.5)/100-107.59;
			     System.out.println("o seu desconto é:" + irpf);
			 } else if (s<=2866.70) { 
				 irpf =(s*15)/100-269.84;
				 System.out.println("o seu desconto é:" + irpf);
			 } else if (s<= 3582.00) {
				 irpf =(s*22.5)/100-483.84;
				 System.out.println("o seu desconto é:" + irpf);
			 } else {
				 irpf = (s*27.5)/100-662.94;
				 System.out.println("o seu desconto é:" + irpf);
			 }
			  ler.close();
		 }
	}


