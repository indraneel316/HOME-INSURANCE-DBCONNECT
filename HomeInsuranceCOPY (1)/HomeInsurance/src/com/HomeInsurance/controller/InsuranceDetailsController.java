package com.HomeInsurance.controller;

import java.util.Scanner;

import com.HomeInsurance.DAO.DAOoperations;
import com.HomeInsurance.businesslogic.DamageCostCalculate;
import com.HomeInsurance.businesslogic.InsuranceCalculator;
import com.HomeInsurance.businesslogic.NewUserRegistration;
import com.HouseInsurace.model.Customer;
import com.HouseInsurace.model.HomeInsurance;

public class InsuranceDetailsController {
	HomeInsurance Obj=new HomeInsurance();
	InsuranceCalculator Obj2= new InsuranceCalculator();
	NewUserRegistration Obj3= new NewUserRegistration();
	Customer Obj5=new Customer();
	DAOoperations ObjforDb=new DAOoperations();
	Main Ob=new Main();
                                     Scanner sc= new Scanner(System.in);
	              
				public void insuranceDetails(Customer Obj5)
	               {
	            	   System.out.println("WELCOME TO ABC INSURANCE");
	            	   System.out.println("1-VIEW POLICY 2-APPLY POLICY 3-CLAIM INSURANCE");
	            	   int viewApply=sc.nextInt();
	            	   sc.nextLine();
	            	   switch(viewApply)
	            	   {
	            	   case 1:
	            		   System.out.println("THIS COMPANY PROVIDES TWO SCHEMES ON YEARLY BASIS ");
	            		   System.out.println("Yearly Schemes: 1 year policy and 5 years policy");
	            		   System.out.println("The insurance can be sanctioned for Fire Damage,Floods,Theft,Electricity damage");
	            		   System.out.println("The maximum amount for insurance claim would be upto 25 Lakhs Depending On your valuables and damages of your house");
	            		   //insuranceDetails();
	                          break;
	            	   case 2:
	            		   if(!NewUserRegistration.claimstat.containsKey(Obj5.getEmailIDofExistingUser()))
	            		   {
	            		   System.out.println("CHOOSE POLICY");
	            		   System.out.println("1-One Year Policy 2-Five Year Policy");
	            		   int choosePolicy=sc.nextInt();
	            		   
	            		   
	            		   Obj.setNumberOfYears(choosePolicy);  
	            		   Double insuranceAmount = null;
	            		   if(NewUserRegistration.hmap3.containsKey(Obj5.getEmailIDofExistingUser()))
	            		   {  
	            			  insuranceAmount= NewUserRegistration.hmap3.get(Obj5.getEmailIDofExistingUser());
	            			  System.out.println("YOUR HOUSE WORTH IN APPROXIMATION: "+insuranceAmount);
	            			 	            		   }
	            		    
	            		   Obj.setInsuranceAmount(insuranceAmount);
	            		  // double sqfeet=NewUserRegistration.hmap4.get(NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser())).getSqfeetOfHouse();
	            		  // double marketvalue=NewUserRegistration.hmap4.get(NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser())).getMarketValue();
	            		  // Obj2.insuranceCalculator(Obj,NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser()).getSqfeetOfHouse());
	            		   
	            		  Customer c= NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser());
	            		 
	            		   ObjforDb.policyDetails(c.getUserId(),choosePolicy,insuranceAmount.doubleValue(),Obj2.insuranceCalculator(Obj,NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser()).getSqfeetOfHouse()),Obj5.getEmailIDofExistingUser(),NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser()).getSqfeetOfHouse(),NewUserRegistration.hmap4.get(Obj5.getEmailIDofExistingUser()).getMarketValue());
	            		   System.out.println("=========THANK YOU==========");
	            		   NewUserRegistration.claimstat.put(Obj5.getEmailIDofExistingUser(),1);
	            		   System.out.println("LOGGING OUT.....");
	            		   Ob.input();
	            		   }
	            		   else
	            		   {
	            			   System.out.println("POLICY IS ACTIVE RIGHT NOW ! YOU CANNOT APPLY UNTIL IT GETS INACTIVE");
	            			   Ob.input();
	            		   }
	            		   
	            		   break;
	            	   case 3:
	            		   if(NewUserRegistration.claimstat.containsKey(Obj5.getEmailIDofExistingUser())&&!NewUserRegistration.applystat.containsKey(Obj5.getEmailIDofExistingUser()))
	            		   {
	            		   Scanner sc2=new Scanner(System.in);
	            		   System.out.println("DAMAGE TYPE: 1-THEFT 2-VANDALISM 3-FIRE DAMAGE 4-FLOODS 5-ELECTRICITY" );
	            		   int damType=sc2.nextInt();
//	            		   System.out.println("PLEASE TELL US ABOUT THE INCIDENT(When and How)");
//	            		   String message=sc2.nextLine();
	            		   ObjforDb.claim(Obj5.getEmailIDofExistingUser());
	            		   DamageCostCalculate ObjVal=new DamageCostCalculate();
	            		   ObjforDb.claim(Obj5.getEmailIDofExistingUser());
	            		   ObjVal.calculateInsuranceClaim(damType,Obj5);
	            		   System.out.println("=========THANK YOU==========");
	            		   
	            		   System.out.println("LOGGING OUT.....");
	            		   NewUserRegistration.applystat.put(Obj5.getEmailIDofExistingUser(),1);
	            		   Ob.input();
	            		   }
	            		   else
	            		   {
	            			   System.out.println("YOU CANNOT CLAIM INSURANCE WITHOUT HOLDING ANY POLICIES");
	            			   Ob.input();
	            		   }
	            		   
	            		   break;
	            		   
	            		   
	            	   }
	            	   
	               }
}
