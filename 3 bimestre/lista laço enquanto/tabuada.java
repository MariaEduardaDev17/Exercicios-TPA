import java.util.Scanner;
public class tabuada {
public static void main(String [] args) {
	Scanner ler = new Scanner(System.in);
	int i=0, n=1, r;
	
	while (n<=10) {
		while(i<11) {
			r=n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		}
		i=1;
		n++;	
	}
	}
}
