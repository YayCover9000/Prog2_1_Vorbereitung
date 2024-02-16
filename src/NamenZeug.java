import java.util.Scanner;
public class NamenZeug {
	private String vorname;
	private String nachname;
	
	public static void VorUndNachName(int laenge) {
		Scanner sc = new Scanner(System.in);
		NamenZeug[] liste = new NamenZeug[laenge];
		for(int i = 0; i < liste.length; i++) {
			liste[i] = new NamenZeug();
		}
		for(int i = 0; i < liste.length; i++) {
			liste[i].setVorname(sc.next());
			liste[i].setNachname(sc.next());
		}
		sc.close();
		for(int i = 0; i < liste.length; i++) {
			System.out.println(liste[i].toString());
		}
		//foreach wie in Aufgabenblatt geforedert
		for(NamenZeug e:liste) {
			System.out.println(e.toString());
		}
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;	
	}
	public String getVorname() {
		return vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getNachname() {
		return nachname;
	}
	public String toString() {
		return String.format("%s %s", vorname, nachname);
	}
	
	
	
	
}
