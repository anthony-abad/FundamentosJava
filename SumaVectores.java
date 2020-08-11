
public class SumaVectores {

	public static void main(String[] args) {
		int [] v1 = new int []{
				1,2,3,5,12,15,27
		};
		int [] v2 = new int []{
				1,8,6,5,12,15,27
		};
		
		int sumav1=0;
		int sumav2=0;
		
		for(int i=0; i<v1.length; i++) {
			sumav1 += v1[i];
		}
		for(int i=0; i<v2.length; i++) {
			sumav2 += v2[i];
		}
		if(sumav1>sumav2) {
			System.out.println("Vector 1 Es Mayor:" + sumav1);
		} else if (sumav1<sumav2) {
			System.out.println("Vector 2 Es Mayor:" + sumav2);
		} else {
			System.out.println("Ambos vectores son iguales: "+sumav1);
		}

	}

}
