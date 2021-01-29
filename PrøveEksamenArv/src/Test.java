import java.util.ArrayList;


public class Test {
	
	
	public static void main(String[] args) {
	
		Abonnement abonnement = new Abonnement(100, 1);
		
		TimePakke timePakke = new TimePakke(150, 2, 20);
		
		UdvidelsesPakke udvidelsesPakke = new UdvidelsesPakke(200, 3, 20);
		
		ArrayList<Abonnement> arrayList = new ArrayList<>();
		
		arrayList.add(abonnement);
		arrayList.add(timePakke);
		arrayList.add(udvidelsesPakke);
		System.out.println(arrayList);
	
		System.out.println("sum af alle abonnementer, abonnement: " +  abonnement.abonnementPris() + 
				" timepakke: " + timePakke.abonnementPris() + " udvidelsespakke: " +
				udvidelsesPakke.abonnementPris() + " samletpris: " + samletPris(arrayList));	
	}
	
	public static double samletPris(ArrayList<Abonnement> arrayList) {
		double samletPris = 0.0;
		for (Abonnement ab : arrayList) {
			samletPris += ab.abonnementPris();
		}
		return samletPris;
	}

}
