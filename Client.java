
public class Client {
	private String imya;
	public Client(String i){
		this.imya = i;
	}
	public void Jisty(Strava s){
	   System.out.println("Клієнт " + imya + " замовив страву " + setNazvaStravy("NogaDynozavra"));
	}
	private String setNazvaStravy(String noga) {
		
		return noga;
	}

}
