import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
			float capital;
			float retribucion;	
		
				System.out.println("Introduce el capital:  ");
				capital=teclado.nextFloat();
		
					retribucion= capital * 0.02f;
		
						System.out.println("Retribucion: "+retribucion);
//				System.out.println("Retribucion: "+(capital * .02f));
						teclado.close();

	}
}
