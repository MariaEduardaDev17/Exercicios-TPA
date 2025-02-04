package prjfesta;

import java.util.Scanner;

public class festa {
	public static void main(String args[]) {
		Scanner ler= new Scanner(System.in);
		double b, bebida;
		int h, f, d, s, t;
		
		System.out.println("digite a quantidade de homens :");
		h = ler.nextInt();
		
		System.out.println("digite a quantidade de mulheres :");
		f = ler.nextInt();
		
		t= h+f;
		
		s= (h*15)+(f*10);
		
		d= (h*6)+(f*8);
		
		b= ((h+f)*100)/1000;
		
		bebida= (h*600+f*500)/1000;
		
		System.out.println(" a quantidade de convidados  são: "+t);
		System.out.println(" a quantidade de salgados necessarios são: "+s);
		System.out.println(" a quantidade de doces necessarios são:"+ d);
		System.out.println(" a quantidade de bolo para os convidados em kg são: "+b);
		System.out.println(" a quantidade de bebida para os convidados em litros são: "+bebida);
		ler.close();
	}

}
