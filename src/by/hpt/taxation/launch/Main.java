package by.hpt.taxation.launch;

import by.hpt.taxation.calculation.Acauntent;
import by.hpt.taxation.domain.Taxpayer;

public class Main {

	public static void main(String[] args) {
		
	Taxpayer p1=new Taxpayer("Vasya","Ivanov");
			System.out.println(p1);
			
	p1.myJob(1000);				
	System.out.println(p1);
	
			
	p1.mySecondJob(100);				
	System.out.println(p1);
	
			
	p1.myGift(200);				
	System.out.println(p1);
		
	p1.myTransfer(150);				
	System.out.println(p1);
	
	p1.mySale(700);				
	System.out.println(p1);
	
	Acauntent.showTax(p1);
	Acauntent.calcTax(p1);
		
		
		
	}

}