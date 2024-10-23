
public class Account {
	private double accno;
	private String acctype;
	private double accbal;
	public Account(double accno, String acctype, double accbal) {
	
		this.accno = accno;
		this.acctype = acctype;
		this.accbal = accbal;
	}
	public double getAccno() {
		return accno;
	}
	public void setAccno(double accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	
	

}
