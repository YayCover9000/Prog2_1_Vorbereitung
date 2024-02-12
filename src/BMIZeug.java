import java.util.Scanner;

public class BMIZeug {
	
	public static void Auf13BMI_InputString() {
		String input;
		int vorkomma;
		int nachkomma;
		
		
	}
	public static void Auf13BMI_InputZweiDoubels() {
		/*TODO Ziel ist es, ein Programm für die Ermittlung des so
			genannten Body-Mass-Index (BMI) zu schreiben.
			• Schreiben Sie ein Programm, dass das Körpergewicht in Kilogramm und die
			Körpergröße in Meter einer Person in der Konsole einliest. Berechnen Sie daraus den
			BMI mit der korrekten Formel.
			• Der Nachkommateil soll auf eine Stelle gerundet und mit einem normalen Komma
			getrennt ausgegeben werden.
			• Beispielausgabe:
			Koerpergewicht: 75 kg
			Koerpergroesse: 1.8 m
			Der BMI betraegt: 23 , 1
			*/
		Scanner sc = new Scanner(System.in);
//		int weight = sc.nextInt();
//		double height = sc.nextDouble();
		int weight = 56;
		double height = 1.50;
		double bmi;
		int vorkomma;
		double nachkomma;
		System.out.println("Groesse: "+height);
		System.out.println("Gewicht: "+weight);
		bmi = weight/(height*height);
		vorkomma = (int)bmi;
		nachkomma= bmi-vorkomma;
		nachkomma = nachkomma*10;
		nachkomma=Math.round(nachkomma);
		System.out.println("BMI: "+vorkomma+","+(int)nachkomma);
		//System.out.println("BMI: "+bmi);
		sc.close();
	
		
		
	}
}
