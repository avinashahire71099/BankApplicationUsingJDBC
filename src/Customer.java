
public class Customer {
	private int custid;
	private String custname;
	private double custmobno;
	private Account obj1;
	private Address obj2;
	public Customer(int custid, String custname, double custmobno, Account obj1, Address obj2) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmobno = custmobno;
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getCustmobno() {
		return custmobno;
	}
	public void setCustmobno(double custmobno) {
		this.custmobno = custmobno;
	}
	public Account getObj1() {
		return obj1;
	}
	public void setObj1(Account obj1) {
		this.obj1 = obj1;
	}
	public Address getObj2() {
		return obj2;
	}
	public void setObj2(Address obj2) {
		this.obj2 = obj2;
	}

	
}
