import java.util.Scanner;

public class BMIZeug {
	
	public static void Auf13BMI_InputString() {
		Scanner sc = new Scanner(System.in);
		String input = "56 1,50";
		String arr[];
		int vorkomma;
		int nachkomma;
		
		sc.close();
		
		
	}
	public static void Auf13BMI_InputZweiDoubels() {
		Scanner sc = new Scanner(System.in);
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
		sc.close();
	
		
		
	}
}
