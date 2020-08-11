import java.util.Scanner;

public class BusquedaValor {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Ingrese el numero que desea buscar");
		Scanner in = new Scanner (System.in);
		num = in.nextInt();
		
		int [] numeros = new int[5];
		numeros[0] = 1;
		numeros[1] = 10;
		numeros[2] = 100;
		numeros[3] = 1000;
		numeros[4] = 10000;
		
		int posicion = -1;
		
		for(int i=0; i<numeros.length; i++) {
			if(num==numeros[i]) {
				posicion = i;
			}
			
		}
		if(posicion!=-1) {
			System.out.println("El numero: "+ num+ "fue encontrado en la posicion:"+posicion);
		} else {
			System.out.println("El numero: "+num+" No fue encontrado");
		}
		

	}

}
