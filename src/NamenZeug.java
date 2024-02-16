import java.util.Scanner;
public class NamenZeug {
	private String vorname;
	private String nachname;
	
	public static void VorUndNachName(int laenge) {
//		namensListe(laenge);
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
//		NamenZeug meinName = new NamenZeug("Paul","Peter");
//		System.out.println(meinName.toString());
	}
	
//	public static NamenZeug[] namensListe(int laenge) {
//		Scanner sc = new Scanner(System.in);
//		NamenZeug[] liste = new NamenZeug[laenge];
//		for(int i = 0; i < liste.length; i++) {
//			liste[i] = new NamenZeug();
//		}
//		for(int i = 0; i < liste.length; i++) {
//			liste[i].setVorname(vorname);
//			liste[i].setNachname(nachname);
//		}
//		sc.close();
//		return liste;
//	}
	public NamenZeug() {
		this(null, null);
	}
	public NamenZeug(String vorname) {
		this(vorname,null);
	}
	public NamenZeug(String vorname, String nachname) {
		setVorname(vorname);
		setNachname(nachname);
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
