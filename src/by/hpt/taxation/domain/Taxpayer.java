package by.hpt.taxation.domain;

import java.util.Arrays;

import by.hpt.taxation.calculation.Acauntent;



public class Taxpayer {
	private String name;
	private String soname;
	private Tax[] myTax;
	private int index=0;
	private int size=1;
	{
		myTax=new Tax[size];
	}
	public String getName() {
		return name;
	}

	public String getSoname() {
		return soname;
	}
	Acauntent acauntent=new Acauntent();
	
	public Taxpayer(String name, String soname) {
		super();
		this.name = name;
		this.soname = soname;
	}

	public Taxpayer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void addTax(Tax tax) {
		//if (index == 0) {
		//	myTax = new Tax[size];		}
		myTax[index] = tax;
		index++;
		if (index >= size) {
			size++;
			Tax[] myArrayCopy = new Tax[size];
			for (int i = 0; i < myTax.length; i++) {
				myArrayCopy[i] = myTax[i];
			}
			myTax = myArrayCopy;
		}
	}
		
	@Override
	public String toString() {
		return "Taxpayer [name=" + name + ", soname=" + soname + ", myTax=" + Arrays.toString(myTax) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((soname == null) ? 0 : soname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taxpayer other = (Taxpayer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (soname == null) {
			if (other.soname != null)
				return false;
		} else if (!soname.equals(other.soname))
			return false;
		return true;
	}

	public Tax[] getMyTax() {
		return myTax;
	}
//	Acauntent acauntent=new Acauntent();
	Tax tax=new Tax();
	public  void myJob(int income){
		tax=acauntent.taxJob(income);
		addTax(tax);	
	}
	
	public  void mySecondJob(int income){
		tax=acauntent.taxSecondJob(income);
		addTax(tax);	
	}
	
	public  void mySale(int income){
		tax=acauntent.taxSale(income);
		addTax(tax);	
	}

	public  void myGift(int income){
		tax=acauntent.taxGift(income);
		addTax(tax);	
	}

	public  void myTransfer(int income){
		tax=acauntent.taxTransfer(income);
		addTax(tax);	
	}

	
}
