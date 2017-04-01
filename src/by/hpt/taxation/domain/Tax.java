package by.hpt.taxation.domain;

public class Tax {
	private int id;
	private String title;
	private double income;
	private int percent;
	private double taxPayment;

	public Tax() {
		super();
		
	}
	
	public Tax(int id, String title, double income, int percent, double taxPayment) {
		super();
		this.id = id;
		this.title = title;
		this.income = income;
		this.percent = percent;
		this.taxPayment = taxPayment;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public double getTaxPayment() {
		return taxPayment;
	}
	public void setTaxPayment(double taxPayment) {
		this.taxPayment = taxPayment;
	}
	@Override
	public String toString() {
		return "Tax [id=" + id + ", title=" + title + ", income=" + income + ", percent=" + percent + ", taxPayment="
				+ taxPayment + "]";
	}
	
	
}
