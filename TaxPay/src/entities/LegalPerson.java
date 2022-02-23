package entities;

public class LegalPerson extends TaxPayer{
	
	private Integer nFunc;
	
	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer nFunc) {
		super(name, annualIncome);
		this.nFunc = nFunc;
	}
	
	public Integer getnFunc() {
		return nFunc;
	}

	public void setnFunc(Integer nFunc) {
		this.nFunc = nFunc;
	}

	@Override
	public Double payment() {
		if (nFunc > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}

}
