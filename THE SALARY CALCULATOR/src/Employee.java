
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYears;
	double Bonus;
	double tax;
	double raise;
	
	Employee(String name,int salary,int workHours,int hireYears){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYears=hireYears;
		
	}
	
	public double tax() {
		if(this.salary>=1000.0) {
			this.tax=(this.salary*0.03);
			
			return this.tax;
		}else {
			
			
			return 0;
		}
	}
	
	public double bonus() {
		if(this.workHours>=40) {
			this.Bonus=30*(this.workHours-40);
			return  this.Bonus;
		}else {
			this.Bonus=0;
			return this.Bonus;
		}
	}
	
	public double raiseSalary() {
		if(2021-this.hireYears<10) {
			this.raise=(this.salary*0.05);
			
			return this.raise;
		
		}else if(2021-this.hireYears>=10&&2021-this.hireYears<20) {
			this.raise=(this.salary*0.10);
			
			return this.raise;
		}else if(2021-this.hireYears>=20) {
			this.raise=this.salary*((0.15));
			
			return this.raise;
		}
		else if(this.hireYears==0) {
			return 0;
		}
		return 0;
	}
	
	
	
	
	
	public String toString() {
		
		double total = this.salary-tax()+ bonus()+raiseSalary();
		double tot= this.salary+bonus() - tax();
	
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+ salary);
		System.out.println("Working hour"+ this.workHours);
		System.out.println("Year of commencement : "+ this.hireYears);
		System.out.println("Tax: "+ this.tax());
		System.out.println("Bonus : " + this.bonus());
		System.out.println("Salary increase :" + this.raiseSalary());
		System.out.println("Salary along with taxes and bonuses:"+ tot);
		System.out.println("Total salary: "+ total);
	
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e =new Employee("kemal",2000,45,1985);
		
		System.out.println(e.toString());
		
		
		
	}

}
