
public class ZeitZeug {
	private int stunde;
	private int minute;
	private int sekunde;
	
	public static void ZeitAufruf() {
		ZeitZeug Uhr1 = new ZeitZeug();
		Uhr1.setzeZeit(1,1,1);
		
		
		
		
	}
	//Sozusagen Konstruktor....
	public boolean setzeZeit(int stunde, int minute, int sekunde) {
		if(stunde < 0 || stunde > 24 || minute < 0 || minute > 60 || sekunde < 0 || sekunde > 60) {
			System.out.println("Fehler");
			return false;
			
		} else {
			setStunde(stunde);
			setMinute(minute);
			setSekunde(sekunde);
			System.out.println(toString());
			System.out.println();
			System.out.print(inSekunden());
			return true;
			
		}
	}
	
	public String toString() {
		return String.format("%s:%s:%s", getStunde(), getMinute(), getSekunde());
	}
	
	public long inSekunden() {
		return (stunde*60 + minute * 60 + sekunde);
	}
	
	
	
	
	public static void Ausgabe1(ZeitZeug Uhr1) {
		System.out.println(Uhr1.getStunde());
		System.out.println(Uhr1.getMinute());
		System.out.println(Uhr1.getSekunde());
	}
	
	
	//Geheimnisprinzip
	public void setStunde(int stunde) {
		this.stunde = stunde;
	}
	public int getStunde() {
		return stunde;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	
	public void setSekunde(int sekunde) {
		this.sekunde = sekunde;
	}
	public int getSekunde() {
		return sekunde;
	}
}
