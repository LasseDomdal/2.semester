
public class TimePakke extends Abonnement {

	private int frietimer;

	public TimePakke(double mndPris, double minutPris, int frietimer) {
		super(mndPris, minutPris);
		this.frietimer = frietimer;
	}

	@Override
	public String toString() {
		return super.toString() +  "TimePakke [frietimer=" + frietimer + "]";
	}
	
	
	


	

	
}
