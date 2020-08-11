
public class ContarPositivosNegativos {

	public static void main(String[] args) {
		int [] numeros = new int[] {
				10,-12, 0,15, 12,-15,27,30, 0, -27
		};
		
		System.out.println("Total De Numeros: "+numeros.length);
		int contapositivos=0,contanegativos=0,contaceros=0;
		int sumapositivos = 0, sumanegativos = 0;		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]>0) {
				contapositivos++;
				sumapositivos += numeros[i];
			}if(numeros[i]<0) {
				contanegativos++;
				sumanegativos += numeros[i];
			}if(numeros[i]==0) 
				contaceros++;
		}
			System.out.println("Numeros Positivos: "+contapositivos);
			System.out.println("Numeros Negativos: "+contanegativos);
			System.out.println("Numeros Ceros: "+contaceros);
			System.out.println("Suma de positivos: "+sumapositivos);
			System.out.println("Suma de negativos: "+sumanegativos);
	}
}
