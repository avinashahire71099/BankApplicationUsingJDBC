
public class Address {
	private String state;
	private String dist;
	private String village;
	public Address(String state, String dist, String village) {
		super();
		this.state = state;
		this.dist = dist;
		this.village = village;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	
	

}
