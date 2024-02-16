
public class ZiffernsummenZeug {
	public static void Auf20_Ziffernsumme()	{
		
		int eingeleseneZahl = 1234567890;
		int ziffer = 0;
		
		while(eingeleseneZahl > 0) {
			ziffer = ziffer + (eingeleseneZahl % 10);
			eingeleseneZahl = eingeleseneZahl / 10;
		}
		System.out.println(ziffer);
		
		
	}
	public static void Auf20_Zifffernsumme_ausString() {
		String eingeleseneZahl = "184";
		int[] arr = new int[eingeleseneZahl.length()];
		int summe = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = eingeleseneZahl.charAt(i) - 48;
		}
		
		for(int e : arr) {
			summe+= e;
			
		}
		System.out.println(summe);
	}
}
