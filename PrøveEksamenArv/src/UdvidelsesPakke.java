
public class UdvidelsesPakke extends Abonnement {

	private double plusPris;
	
	public UdvidelsesPakke(double mndPris, double minutPris, double plusPris) {
		super(mndPris, minutPris);
		this.plusPris = plusPris;
		
	}

	@Override
	public Double abonnementPris() {
		return super.abonnementPris() + this.plusPris;
	}

	@Override
	public String toString() {
		return super.toString() + "UdvidelsesPakke [plusPris=" + plusPris + "]";
	}

	
	
	
	

}
