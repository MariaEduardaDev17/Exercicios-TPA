package listacomplementar;
 import java.util.Scanner;
public class prestacao2 {
	    public static void main (String args[]) {
	    	Scanner ler = new Scanner (System.in);
	    	double p,d,t1,t2,t3;
	    	
	    	System.out.println("Digite o valor da prestação: ");
	    	p = ler.nextDouble();
	    	
	    	System.out.println("Digite a quantidade de dias: ");
	    	d = ler.nextDouble();
	    	
	    	if (d<=45) {
	    		t1 =p/100*2;
	    		t2 = d/100*1;
	    		t3=t1+t2+p;
	    		System.out.println("O total de juros a pagar é de:"+t3);
	    	}else {
	    		t1 =(p/100)*3;
	    		t2 = (d/100)*1;
	    		t3=t1+t2+p;
	    		System.out.println("O total de juros a pagar é de:"+t3);
	    	}
	    	ler.close();
}
}