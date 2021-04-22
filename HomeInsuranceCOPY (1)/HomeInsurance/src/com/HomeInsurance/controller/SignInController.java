package com.HomeInsurance.controller;

import java.util.Scanner;

import com.HomeInsurance.DAO.DAOoperations;
import com.HomeInsurance.businesslogic.LoginValidation;
import com.HomeInsurance.businesslogic.NewUserRegistration;
import com.HomeInsurance.businesslogic.ValueCalculator;
import com.HouseInsurace.model.Customer;

public class SignInController {
	DAOoperations ObjFordb= new DAOoperations();
	 public void optionChoose(int option)
	 {   Scanner sc=new Scanner(System.in);
		 Customer Obj= new Customer();
	   NewUserRegistration Obj2= new  NewUserRegistration();
	   LoginValidation Obj3=new LoginValidation();
	   ValueCalculator Objval=new ValueCalculator();
	   Main Obj4=new Main();
	   InsuranceDetailsController Obj5=new InsuranceDetailsController();
	   
	if(option==1)
	{ 
		System.out.println("Enter Email ID");
		String emailIdOfexistingUser=sc.nextLine();
		System.out.println("Enter Password");
		String passwordOfExistingUser=sc.nextLine();
		Obj.setEmailIDofExistingUser(emailIdOfexistingUser);
		Obj.setPasswordOfExistingUser(passwordOfExistingUser);
		Obj3.validateLogin(Obj);
		if(Obj3.val.equals("LOGGING IN..."))
		{
		Obj5.insuranceDetails(Obj);
		Obj4.input();}
		else
		{
			Obj4.input();
		}
    		   
	}
	
	if(option==2)
		
	{  String tvprice = null,fridgeprice = null,jewelleryprice = null,wmprice = null,clothprice = null,sofaprice = null,dtprice = null,cash = null,bedprice = null;
		Scanner sc1=new Scanner(System.in);
		System.out.println("CREATE ACCOUNT");
		System.out.println("Enter Email ID");
		String newUserEmailID=sc1.nextLine();
		Obj.setNewUserEmailId(newUserEmailID);
		System.out.println("Enter PASSWORD");
		String newUserPassword=sc1.nextLine();
		System.out.println("ENTER Date Of Birth");
		String dobOfNewUser=sc1.nextLine();
		System.out.println("Enter ADDRESS ");
		String addressOfNewUser=sc1.nextLine();
		System.out.println("Enter Phone Number");
		String phoneNumberOfNewUser=sc1.nextLine();
		System.out.println("Dwelling Style??");
		String dwellingStyleOfNewUser=sc1.nextLine();
		System.out.println("ENTER YOUR SQUARE FEET OF THE HOUSE");
	    double sqfeetOfHouse=sc.nextDouble();
	    System.out.println("ENTER MARKET VALUE OF THE HOUSE ");
	    double marketvalue=sc1.nextDouble();
	    System.out.println("ENTER THE YEAR BUILT");
	    int yearbuilt=sc1.nextInt();
	    System.out.println("LIST OF VALUABLES CONSIDERED WHILE CLAIMING FOR INSURANCE ");
	    System.out.println("[TV,FRIDGE,JEWELLERY,WASHING MACHINE,CLOTHES,SOFAS,DINING TABLE,CASH,BED]");
	    System.out.println("CHOOSE THE ITEMS WHICH YOU OWN FROM THE ABOVE MENTIONED LIST(Please enter the price as 0 if you don't own any in particular)");
	    Scanner sc2= new Scanner(System.in);
	    	System.out.println("ENTER THE PRICE OF THE TV");
	    	 tvprice=sc2.nextLine();
	    	System.out.println("ENTER THE PRICE OF THE FRIDGE");
	    	 fridgeprice=sc2.nextLine();
	    	System.out.println("ENTER THE WORTH OF THE JEWELLERY");
	    	 jewelleryprice=sc2.nextLine();
	    	System.out.println("ENTER THE PRICE OF THE WASHING MACHINE");
	    	 wmprice=sc2.nextLine();
	    	System.out.println("ENTER CLOTHES WORTH");
	    	 clothprice=sc2.nextLine();
	    	System.out.println("ENTER PRICE OF THE SOFAS");
	    	 sofaprice=sc2.nextLine();
	    	System.out.println("ENTER THE PRICE OF DINING TABLE");
	    	dtprice=sc2.nextLine();
	    	System.out.println("ENTER THE APPROXIMATE CASH YOU HOLD ");
	    	 cash=sc2.nextLine();
	    	System.out.println("ENTER THE PRICE OF THE BED");
	    	bedprice=sc2.nextLine();
	    	  Obj.setNewUserTvprice(tvprice);
	  	    Obj.setNewUserFridgePrice(fridgeprice);
	  	    Obj.setNewUserJewelleryPrice(jewelleryprice);
	  	    Obj.setNewUserWmPrice(wmprice);
	  	    Obj.setNewUserClothprice(clothprice);
	  	    Obj.setNewUserSofaPrice(sofaprice);
	  	    Obj.setNewUserDtPrice(dtprice);
	  	    Obj.setNewUserCash(cash);
	  	    Obj.setNewUserBedPrice(bedprice);
	  	    Obj.setSqfeetOfHouse(sqfeetOfHouse);
	  	    Obj.setMarketValue(marketvalue);
	  	    
	  	    String phoneTemp=phoneNumberOfNewUser.substring(1,4);
	  	    String yearTemp=String.valueOf(yearbuilt);
	  	    int userid=Integer.parseInt(phoneTemp+yearTemp);
	  	    Obj.setUserId(userid);
	  	    Long totvalue=Objval.valcal(Obj);
	  	    String allvalues=tvprice+" "+fridgeprice+" "+jewelleryprice+" "+wmprice+" "+clothprice+" "+sofaprice+" "+dtprice+" "+cash+" "+bedprice;	  	  
	  	    Obj2.claim(Obj, allvalues);
	  	    Obj2.apply(Obj,totvalue,marketvalue);
	        
	    
	    
	   	Obj.setNewUserPassword(newUserPassword);
	   	Obj.setNewUserPhoneNumber(phoneNumberOfNewUser);
		Obj.setNewUserDob(dobOfNewUser);
		Obj.setNewUserAddress(addressOfNewUser);
		
		NewUserRegistration.hmap4.put(Obj.getNewUserEmailId(),Obj);
		ObjFordb.database(Obj,totvalue,marketvalue,yearbuilt);
		

	    
		Obj2.addNewUser(Obj);
		Obj4.input();
		
		
		
		
	}

}
}
