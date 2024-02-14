
public class TuermeHanoi {
	public static void tuermeHanoi() {
		//Initialisierung
		int A [] = new int[5];
		int B [] = new int[A.length];
		int C [] = new int[A.length];
		
		ArrayBefuellen(A);
		Algorithmus(A, B, C);
		Ausgabe(A, B, C);
	}
	
	//Algorithmus
	public static void Algorithmus(int[] A, int[] B, int[]C) {
		for(int i = 0; i < A.length; i++) {
//			B[i] = A[i];
			if(A[i] > B[i]) {
				if(B[i] > B[i] && B[i]!=0) {
					B[i] = A[i];
					A[i] = 0;
				}
				
			}
		}
	}
	
	//Test Ausgabe
	public static void Ausgabe(int[] A, int[] B, int[]C) {
		System.out.println("A\sB\sC\s");
	
			for(int i = 0; i < A.length; i++) {
				System.out.print(A[i]);
				System.out.print("\s"+B[i]+"\s");
				System.out.print(C[i]+"\s");
				System.out.println();
			}
	}
			
	//Array befuellen
			public static void ArrayBefuellen(int[] A) {
				for (int i = 0; i < A.length; i++) {
					A[i]=i+1;
				}
			}
}
