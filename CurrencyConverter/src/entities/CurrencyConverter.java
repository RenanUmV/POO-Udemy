package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double convDollarToReal(double amount, double dollarPrice) {
		return amount*dollarPrice*(1 + IOF);
	}
}
