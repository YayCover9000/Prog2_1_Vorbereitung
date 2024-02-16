import java.util.Scanner;
public class EuklidZeug {
	public static void Euklid() {
		Scanner sc = new Scanner(System.in);
		int kZahl = sc.nextInt();
		int gZahl = sc.nextInt();
		int ggZahl = 0;
		sc.close();
		berechnung(kZahl,gZahl,ggZahl);
		
		
	}
	public static void berechnung(int kZahl,int gZahl, int ggZahl) {
		if(kZahl < gZahl) {
			//Berechnung
			ggZahl = gZahl%kZahl;
			gZahl = kZahl;
			kZahl = ggZahl;
			
		} else if(kZahl > gZahl) {
			gZahl = kZahl;
		}else {
			System.out.println("Fehler");
		}
	}
	public static void Ausgabe(int zahl) {
		System.out.println("Die  groessere Zahl ist: " + zahl); 
	}
}
