package company;

public class employeinfo {
	public static void main(String[] args) {
		employee employee1 = new employee("harsha", "challa", 20000.00, 23, "12/25/1992", 0);
		employee employee2 = new employee("pavan", "venkata", 18000.00, 23, "10/12/1992", 0);
		employee employee3 = new employee("ravi","chiruvu",16000.00,23,"12/23/1992",0);
		System.out.printf("1:\t %s %s\t \t$%.2f\t %d \t %s\t $%.2f\n", employee1.getFirstName(),
				employee1.getLastName(), employee1.getSalary(), employee1.getAGE(), employee1.getDateofbirth(),
				employee1.getYearlysalary());
		System.out.printf("2:\t %s %s\t\t$%.2f\t %d\t %s\t $%.2f\n", employee2.getFirstName(), employee2.getLastName(),
				employee2.getSalary(), employee2.getAGE(), employee2.getDateofbirth(), employee2.getYearlysalary());
		System.out.printf("3:\t %s %s\t\t$%.2f\t %d\t %s\t $%.2f\n", employee3.getFirstName(), employee3.getLastName(),
				employee3.getSalary(), employee3.getAGE(), employee3.getDateofbirth(), employee3.getYearlysalary());
		
		RegularEmployee RE=new RegularEmployee(0);
		System.out.printf("4:\t $%.2f\n",RE.getYearlysala());
		
		manager M=new manager(0);
		System.out.printf("5:\t $%.2f\n",M.getYearlybonu());
		
		CTO IB=new CTO(0);
		System.out.printf("6:\t $%.2f\n",IB.getYearlyintbonus());
		
		
	}
}

