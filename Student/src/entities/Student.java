package entities;

public class Student {
	public String name;
	public double n1, n2, n3, avg;
	
	public void average() {
		avg = (n1 + n2 + n3);
		System.out.println("FINAL GRADE = " + avg);
		if (avg > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING " + (60 - avg) + " POINTS");
		}
	}

}
