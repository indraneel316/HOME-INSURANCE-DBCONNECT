package com.HomeInsurance.businesslogic;

import com.HouseInsurace.model.Customer;

public class LoginValidation {
	public String val="";
	 NewUserRegistration Obj1= new  NewUserRegistration();
	public void validateLogin(Customer Obj) {
		
if(NewUserRegistration.hmap.containsKey(Obj.getEmailIDofExistingUser()))
{       String tempVal=NewUserRegistration.hmap.get(Obj.getEmailIDofExistingUser());
        if(tempVal.equals(Obj.getPasswordOfExistingUser()))
        { val="LOGGING IN...";
		   System.out.println("LOGGING IN...");
        }
        else
        {  val="INVALID CREDENTIALS";
        	System.out.println("INVALID CREDENTIALS");
        }
	}
else
{val="INVALID";
	System.out.println("INVALID");

}
}}
