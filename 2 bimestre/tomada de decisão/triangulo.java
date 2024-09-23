import java.util.Scanner;
public class triangulo {
      
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
			int a,b,c;
			System.out.println("Digite o valor do lado a:");
			a = ler.nextInt();
			System.out.println("Digite o valor do lado b:");
			b = ler.nextInt();
			System.out.println("Digite o valor do lado c:");
			c = ler.nextInt();
			if (a>b+c || c>a+b) {
				System.out.println("não é um triangulo");
	   }else if (a==b && b==c && c==a) {
			System.out.println("Triangulo eqüilátero");
		}else if (a==b || b==c || c==a) {
			System.out.println("Triangulo isosceles");
		}else {
			System.out.println("Triangulo escaleno");	
		}
	ler.close();}
}
