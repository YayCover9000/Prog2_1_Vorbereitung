
public class ZiffernsummenZeug {
	public static void Auf20_Ziffernsumme()	{
		
		/*
		 * planung
		 * input = 111
		 * input mod 10 = 111%10 = rest 1
		 * geteilt = 111 / 10 = 11
		 * input = geteilt;
		 * 
		 * input mod 10 = 1
		 * geteilt = input/10; = 1
		 * input = geteilt;
		 * 1 mod 10 = 1 .... While geht nicht
		 * 
		 * 
		 * nachgeschaute IDee
		 * 
		 *   while(eingteleseneZahl > 0) {
		 *   ziffer = zahl % 10;
		 *   
		 *   zahl/=10;
		 *   
		 *   
		 * 
		 */
		int eingeleseneZahl = 1234567890;
		int ziffer = 0;
		
		while(eingeleseneZahl > 0) {
			ziffer = ziffer + (eingeleseneZahl % 10);
			eingeleseneZahl = eingeleseneZahl / 10;
		}
		System.out.println(ziffer);
		
		
	}
}
