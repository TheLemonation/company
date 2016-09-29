package company;

public class employee {
	private String firstname;
	private String lastname;
	private int age;
	protected double montlysalary=20000.00;
	private String dob;
	protected  double yearlysalary;
	public employee(String fName, String lName, double sal, int Age, String Dateofbirth, double yearlysal) {
		if (fName != null)
			firstname = fName;
		if (Dateofbirth != null)
			dob = Dateofbirth;
		if (lName != null)
			lastname = lName;
		if (Age > 0)
			age = Age;
		if (sal > 0.0) {
			montlysalary = sal;
		} else {
			montlysalary = 0.0;
		}
		if (montlysalary > 0.0) {
			yearlysalary = 12 * montlysalary;
		} else {
			yearlysalary = 0.0;
		}
	}
//get and set method
	public employee(double yearlybonu) {
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public int getAGE() {
		return age;
	}

	public double getSalary() {
		return montlysalary;
	}

	public String getDateofbirth() {
		return dob;
	}

	public double getYearlysalary() {
		return yearlysalary;
	}

	public void setFirstName(String fName) {
		if (fName != null)
			firstname = fName;
	}

	public void setLastName(String lName) {
		if (lName != null)
			lastname = lName;
	}

	public void setAGE(int Age) {
		age = Age;
	}

	public void setSalary(double sal) {
		if (sal > 0.0) {
			montlysalary = sal;
		} else {
			montlysalary = 0.0;
		}
	}

	public void setDob(String Dateofbirth) {
		Dateofbirth = dob;
	}

	public void setYearlysalary(double Yearlysalary) {
		if (montlysalary > 0.0) {
			yearlysalary = 12 * montlysalary;
		} else {
			yearlysalary = 0.0;
		}

	}
}
//creating a subclass
class RegularEmployee extends employee{
protected static double yearlysala;
	public RegularEmployee(double yearlysala) {
		super(yearlysala);
		
	}
	public double getYearlysala(){
		if(montlysalary>0.0){
			yearlysala=12*montlysalary;
		}
		else{
			yearlysala=0.0;
		}
		return yearlysala ;
	}
	}
	
class manager extends RegularEmployee {
	protected static double yearlybonu;
	public manager(double yearlybonu) {
		super(yearlybonu);
		}
public double getYearlybonu(){
	if(yearlysala>0.0){
		yearlybonu=yearlysala+5000;
	}
	else{
		yearlybonu=0.0;
	}
	return yearlybonu ;
}
}
class CTO extends manager{
private double yearlyintbonu;
	public CTO(double yearbonu) {
		super(yearlybonu);
		
	}
	public double getYearlyintbonus(){
		if(yearlybonu>0.0){
			yearlyintbonu=yearlybonu+1000;
		}
		else{
			yearlyintbonu=0.0;
		}
		return yearlyintbonu;
	}
	
}
