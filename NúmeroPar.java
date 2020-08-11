import java.util.Scanner;

public class NúmeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		System.out.println("Leer Numero");
		Scanner in = new Scanner(System.in);
		numero  = in.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
		//String result = "" + numero;
		//result = Integer.toString(numero);
		
	}

}
