package by.hpt.taxation.calculation;

import by.hpt.taxation.domain.Tax;
import by.hpt.taxation.domain.Taxpayer;

public class Acauntent {
	public static final int TAX_JOB=56;
	public static final int TAX_SECOND_JOB=13;
	public static final int TAX_TRANSFER=3;
	public static final int TAX_GIFT=4;
	public static final int TAX_SALE=12;
//	Taxpayer payer=new Taxpayer();
	
	public static Tax taxJob(int income){
		Tax tax=new Tax();
		tax.setId(1);
		tax.setIncome(income);
		tax.setTitle("TAX_JOB");
		tax.setPercent(TAX_JOB);
		double taxPayment=income*TAX_JOB/100;
		tax.setTaxPayment(taxPayment);
		return tax;
	}
	
	public static Tax taxSecondJob(int income){
		Tax tax=new Tax();
		tax.setId(2);
		tax.setIncome(income);
		tax.setTitle("TAX_SECOND_JOB");
		tax.setPercent(TAX_SECOND_JOB);
		double taxPayment=income*TAX_SECOND_JOB/100;
		tax.setTaxPayment(taxPayment);
		return tax;
	}
	
	public static Tax taxTransfer(int income){
		Tax tax=new Tax();
		tax.setId(3);
		tax.setIncome(income);
		tax.setTitle("TAX_TRANSFER");
		tax.setPercent(TAX_TRANSFER);
		double taxPayment=income*TAX_TRANSFER/100;
		tax.setTaxPayment(taxPayment);
		return tax;
	}

	public Tax taxGift(int income){
		Tax tax=new Tax();
		tax.setId(4);
		tax.setIncome(income);
		tax.setTitle("TAX_GIFT");
		tax.setPercent(TAX_GIFT);
		double taxPayment=income*TAX_GIFT/100;
		tax.setTaxPayment(taxPayment);
		return tax;
	}
	public static Tax taxSale(int income){
		Tax tax=new Tax();
		tax.setId(5);
		tax.setIncome(income);
		tax.setTitle("TAX_SALE");
		tax.setPercent(TAX_SALE);
		double taxPayment=income*TAX_SALE/100;
		tax.setTaxPayment(taxPayment);
		return tax;
	}
	
	
	public static void calcTax(Taxpayer p){ 
		double taxSum=0;
		Tax[] tax = new Tax[p.getMyTax().length];
		tax=p.getMyTax();
		for (int i=0; i< tax.length-1; i++){
			taxSum+=tax[i].getTaxPayment();}
		System.out.println(p.getName()+" "+p.getSoname()+" will pay total tax="+taxSum);	
	}

	public static void  showTax(Taxpayer p){ 
		//double taxSum=0;
		Tax[] tax = new Tax[p.getMyTax().length];
		tax=p.getMyTax();
		System.out.println("Tax of "+p.getName()+" "+p.getSoname()+":");
		for (int i=0; i< tax.length-1; i++){
			System.out.println(tax[i].getTitle()+" "+tax[i].getTaxPayment());}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
