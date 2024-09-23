package listaCaderno;
import java.util.Scanner;

public class ipva {
	public static void main (String arg[]) {
      Scanner ler = new Scanner(System.in);
      double ipva,v;
      System.out.println("coloque o valor do seu veiculo:");
      v= ler.nextDouble();
      ipva= v/100*4;
      System.out.println("seu ipva é:" + ipva);
        
      
}
    
    }
