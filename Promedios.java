import java.util.Scanner;

public class Promedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4, result;

		System.out.println("Ingrese La Nota de Matemáticas:");
		Scanner in = new Scanner (System.in);
		n1 = in.nextInt();
		
		System.out.println("Ingrese La Nota de Lenguaje:");
		Scanner on = new Scanner (System.in);
		n2 = in.nextInt();
		
		System.out.println("Ingrese La Nota de Sociales:");
		Scanner an = new Scanner (System.in);
		n3 = in.nextInt();
		
		System.out.println("Ingrese La Nota de Ciencias:");
		Scanner un = new Scanner (System.in);
		n4 = in.nextInt();
		
		result = ((n1+n2+n3+n4)/4);
		
		if (result>=7) {
			System.out.println("El Estudiante Aprueba Con: "+ result);
		} else {
			System.out.println("El Estudiante No Aprueba: "+ result);
		}
}		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		float n1,n2,n3,n4,result;
		
		System.out.println("Primera Nota");
		Scanner in = new Scanner(System.in);
		n1  = in.nextInt();
		
		System.out.println("Segunda Nota");
		Scanner an = new Scanner(System.in);
		n2  = an.nextInt();
		
		System.out.println("Tercera Nota");
		Scanner on = new Scanner(System.in);
		n3  = on.nextInt();
		
		System.out.println("Cuarta Nota");
		Scanner en = new Scanner(System.in);
		n4  = en.nextInt();
		
		result = ((n1+n2+n3+n4)/4);
		
		if (result > 7) {
			System.out.println("Aprueba El Curso con:" + result);
		} else {
			System.out.println("Reprobo el curso con:" + result);
		}
			
	}
	*/

