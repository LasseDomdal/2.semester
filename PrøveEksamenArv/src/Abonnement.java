
public class Abonnement {
	
	private double mndPris;
	private double minutPris;
	
	
	
	public Abonnement(double mndPris, double minutPris) {
		this.mndPris = mndPris;
		this.minutPris = minutPris;
	}
	
	public Double abonnementPris() {
		return this.mndPris;
	}

	@Override
	public String toString() {
		return "Abonnement [mndPris=" + mndPris + ", minutPris=" + minutPris + "]";
	}
	
	
	
}
