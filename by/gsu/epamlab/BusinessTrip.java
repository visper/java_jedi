package by.gsu.epamlab;

public class BusinessTrip {
	//money will be in US dollar
	private static final int daily_allowance = 50;
	private String employer_id = "Vasia Pupkin";
	private int transport_expances = 100;
	private int day_num = 5;
	
	public BusinessTrip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BusinessTrip(String employer_id, int transport_expances, int day_num) {
		super();
		this.employer_id = employer_id;
		this.transport_expances = transport_expances;
		this.day_num = day_num;
	}
	
	public String getEmployer_id() {
		return employer_id;
	}

	public void setEmployer_id(String employer_id) {
		this.employer_id = employer_id;
	}

	public int getTransport_expances() {
		return transport_expances;
	}

	public void setTransport_expances(int transport_expances) {
		this.transport_expances = transport_expances;
	}

	public int getDay_num() {
		return day_num;
	}

	public void setDay_num(int day_num) {
		this.day_num = day_num;
	}
	
	private int getTotal() {
		return transport_expances+daily_allowance*day_num;	
	}

	public void show() {
		System.out.println("daily_allowance =" + daily_allowance);
		System.out.println("employer_id =" + employer_id);
		System.out.println("transport_expances =" + transport_expances);
		System.out.println("day_num =" + day_num);
		System.out.println("total =" + getTotal());
	}
	
	public String toString() {
//		return this.employer_id +";" + this.daily_allowance + ";" + this.transport_expances +
				//";" + this.day_num + ";" + this.getTotal();
		return employer_id +";" + daily_allowance + ";" + transport_expances +
				";" + day_num + ";" + getTotal();
	}
}
