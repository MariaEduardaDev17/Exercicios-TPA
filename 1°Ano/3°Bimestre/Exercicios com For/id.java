import java.util.Scanner;
public class id {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int anoa=2024,anon,i,id, velho, novo;
	
	System.out.println("escreva o ano de nascimento do usuario:");
	anon= ler.nextInt();
	
	id=anoa-anon;
    
	System.out.println(id);
	
	novo=id;
	velho=id;
	
	for (i=1; i<11; i=i+1 ) {
	
			System.out.println("escreva o ano de nascimento do usuario:");
			anon= ler.nextInt();
			
			id=anoa-anon;
			
			System.out.println(id);
		
			if(id<novo) {
				novo=id;
			} else if (id>velho) {
			 velho=id;
		} 
		
		
		}
	System.out.println("o mais velho tem;"+velho+ "anos");
	System.out.println("o mais novo tem:"+novo+ "anos");
	ler.close();
	}
}

