
public class AutoZeug {
	private int maxiGeschwindigkeit;
	private double tankfuellung;
	private double verbrauch;
	private double kilometerstand;
	private String nummernschild;
	
	
	
	public static void Auto() {
			AutoZeug Bentley = new AutoZeug(500,100.0,1.0,2000.0,"Bendley");
			Bentley.fahren(100, 10);
			AutoZeug BMW = new AutoZeug();
	}
	public AutoZeug() {
		this(0,0,0,0,null);
	}
	public AutoZeug(int maxiGeschwindigkeit) {
		this(maxiGeschwindigkeit,0,0,0,null);
	}
	public AutoZeug(int maxiGeschwindigkeit, double tankfuellung) {
		this(maxiGeschwindigkeit,tankfuellung,0,0,null);
	}
	public AutoZeug(int maxiGeschwindigkeit, double tankfuellung, double verbrauch) {
		this(maxiGeschwindigkeit,tankfuellung,verbrauch,0,null);
	}
	public AutoZeug(int maxiGeschwindigkeit, double tankfuellung, double verbrauch, double kilometerstand) {
		this(maxiGeschwindigkeit,tankfuellung,verbrauch,kilometerstand,null);
	}
	public AutoZeug(int maxiGeschwindigkeit, double tankfuellung, double verbrauch, double kilometerstand, String nummernschild) {
		setMaxiGeschwindigkeit(maxiGeschwindigkeit);
		setTankfuellung(tankfuellung);
		setVerbrauch(verbrauch);
		setKilometerstand(kilometerstand);
		setNummernschild(nummernschild);
		
	}
	public void fahren(int geschwindigkeit, int minuten) {
		if(geschwindigkeit <= getMaxiGeschwindigkeit()) {
			for(int i = 0; i < minuten; i++) {
				setTankfuellung(tankfuellung - (geschwindigkeit+i));
				System.out.println(getTankFuellung());
				System.out.println(i);
			}
		}
	}
	public void tanken(float spritmenge) {
		if(spritmenge > tankfuellung) {
			System.out.println("Fehler");
		}else {
			setTankfuellung(spritmenge);
		}
	}
	public void ausgeben() {
		
	}
	
	//
	public int getMaxiGeschwindigkeit() {
		return maxiGeschwindigkeit;
	}
	public void setMaxiGeschwindigkeit(int maxiGeschwindigkeit) {
		if(maxiGeschwindigkeit >= 0) {
			this.maxiGeschwindigkeit = maxiGeschwindigkeit;
		}
		
	}
	public double  getTankFuellung() {
		return tankfuellung;
	}
	public void setTankfuellung(double tankfuellung) {
		this.tankfuellung = tankfuellung;
	}
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}
	public double getKilometerstand() {
		return kilometerstand;
	}
	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}
	public String getNummernschild() {
		return nummernschild;
	}
	public void setNummernschild(String nummernschild) {
		this.nummernschild = nummernschild;
	}
	
	
}
