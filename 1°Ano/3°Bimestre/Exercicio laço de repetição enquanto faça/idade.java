import java.util.Scanner;
public class idade {
    public static void main (String [] agrs) {
    	Scanner ler = new Scanner (System.in);
    	int i = 1;
    	int anon, anoa, id;
    	
    	while (i<7){
    		System.out.println("Digite o ano de nascimento do us�ario:");
        	anon = ler.nextInt();
        	System.out.println("Digite o ano atual:");
        	anoa = ler.nextInt();
        	id = anoa - anon;
        
        	if (id<18) {
        		System.out.println("Sua idade é" + id + "Menor de idade");
        	}else { 
        		System.out.println("Sua idade é" + id + "Maior de idade");
        	}
        	i = i + 1;
    	}
    	ler.close();
    }
}
