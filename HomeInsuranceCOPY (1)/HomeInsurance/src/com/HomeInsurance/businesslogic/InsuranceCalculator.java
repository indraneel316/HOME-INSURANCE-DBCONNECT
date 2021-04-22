package com.HomeInsurance.businesslogic;

import com.HouseInsurace.model.HomeInsurance;

public class InsuranceCalculator {
         public int insuranceCalculator(HomeInsurance Obj,double val)
         { double val1;
        	 if(Obj.getNumberOfYears()==1)
        	 {
        		  val1= val*Obj.getInsuranceAmount().doubleValue()*0.0000003;
        		  System.out.println("PREMIUM TO BE PAID EVERY MONTH  : "+(int)val1);
        		  return (int)val1;
        	 }
        	 if(Obj.getNumberOfYears()==2)
        	 { 
        		   val1= val* val*Obj.getInsuranceAmount().doubleValue()*0.0000003*12;
        		   System.out.println("PREMIUM TO BE PAID EVERY YEAR: "+(int)val1);
        		   return (int)val1;
        	 }
        	 return 0;
        	 
        	 
         }
}
