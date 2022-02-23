package entities;

public class PhysicPerson extends TaxPayer {
	
	private double healthExpenses;	

	public PhysicPerson() {
	}	

	public PhysicPerson(String name, Double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}
		
	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double payment() {
		if (getAnnualIncome() < 20000) {
			return (getAnnualIncome()*0.15) - (healthExpenses*0.5);
		}
		else {
			return (getAnnualIncome()*0.25) - (healthExpenses*0.5);			
		}
		
	}

}
