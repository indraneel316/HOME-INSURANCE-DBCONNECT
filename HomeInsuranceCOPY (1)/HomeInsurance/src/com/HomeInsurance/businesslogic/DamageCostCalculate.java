package com.HomeInsurance.businesslogic;

import java.util.HashSet;
import java.util.Scanner;

import com.HouseInsurace.model.Customer;


public class DamageCostCalculate {
	Scanner sc=new Scanner(System.in);
	HashSet<Integer> set1=new HashSet<>();
	 NewUserRegistration Obj2=new NewUserRegistration();
	public void calculateInsuranceClaim(int damageType, Customer Obj)
	{ 
	  
	switch(damageType)
	{
	   case 1:
		   System.out.println("[1-TV,2-FRIDGE,3-JEWELLERY,4-WASHING-MACHINE,5-CLOTHES,6-SOFAS,7-DINING TABLE,8-CASH,9-BED]");
		   System.out.println("ENTER THE NUMBER OF VALUABLES LOST CONSIDERING THE ABOVE LIST: ");
		   int lost=sc.nextInt();
		   long sum=0;
		  
		   while(lost>0)
		   { 
			   int inp=sc.nextInt();
			   if(!set1.contains(inp))
			   {
			  
			   
			   sum+=Long.parseLong(Obj2.hmap2.get(Obj.getEmailIDofExistingUser()).get(inp));
			   
		   } 
			   else
		   {
			   System.out.println("YOU HAVE ALREADY MENTIONED THE ITEM");
		   }lost--;
		    
		   }System.out.println("THE SURVEYER WOULD VISIT YOUR HOUSE WITHIN THE NEXT TWO WORKING DAYS");
		   System.out.println("THE APPROXIMATE AMOUNT THAT CAN BE SANCTIONED: "+0.6*sum);
		   
		   
	     
	       break;
	   case 2:
	        System.out.println("ENTER THE APPOX AREA DAMAGED (in sqft ");
	        int damforvand=sc.nextInt();
	        System.out.println("[1-TV,2-FRIDGE,3-JEWELLERY,4-WASHING-MACHINE,5-CLOTHES,6-SOFAS,7-DINING TABLE,8-CASH,9-BED]");
	        System.out.println("ENTER THE NUMBER OF VALUABLES LOST CONSIDERING THE ABOVE LIST: ");
			   int lost1=sc.nextInt();
			   long sum1=0;
			   
			   while(lost1>0)
			   { 
				   int inp=sc.nextInt();
				   if(!set1.contains(inp))
				   {
				  
				   
				   sum1+=Long.parseLong(Obj2.hmap2.get(Obj.getEmailIDofExistingUser()).get(inp));
				   
			   } 
				   else
			   {
				   System.out.println("YOU HAVE ALREADY MENTIONED THE ITEM");
			   }lost1--;
			    
			   }
	        if(damforvand<Obj.getSqfeetOfHouse())
	        {
	        	sum1+=damforvand*1100;
	        }
	        
	       System.out.print("AMOUNT THAT CAN BE SANCTIONED FOR VANDALISM: "+sum1);
	       break;
	   case 3:
		   System.out.println("ENTER THE APPOX AREA DAMAGED (in sqft ");
	        int damforFire=sc.nextInt();
	        System.out.println("[1-TV,2-FRIDGE,3-JEWELLERY,4-WASHING-MACHINE,5-CLOTHES,6-SOFAS,7-DINING TABLE,8-CASH,9-BED]");
	        System.out.println("ENTER THE NUMBER OF VALUABLES LOST CONSIDERING THE ABOVE LIST: ");
			   int lost2=sc.nextInt();
			   long sum2=0;
			   
			   while(lost2>0)
			   { 
				   int inp=sc.nextInt();
				   if(!set1.contains(inp))
				   {
				  
				   
				   sum2+=Long.parseLong(Obj2.hmap2.get(Obj.getEmailIDofExistingUser()).get(inp));
				   
			   } 
				   else
			   {
				   System.out.println("YOU HAVE ALREADY MENTIONED THE ITEM");
			   }lost2--;
			    
			   }
	        if(damforFire<Obj.getSqfeetOfHouse())
	        {
	        	sum2+=damforFire*1100+Obj.getSqfeetOfHouse()/2;
	        }
	        
	       System.out.print("AMOUNT THAT CAN BE SANCTIONED FOR FIRE: "+sum2);
	       break;
	   case 4:
		   System.out.println("ENTER THE APPOX AREA DAMAGED (in sqft ");
	        int damforflood=sc.nextInt();
	        System.out.println("[1-TV,2-FRIDGE,3-JEWELLERY,4-WASHING-MACHINE,5-CLOTHES,6-SOFAS,7-DINING TABLE,8-CASH,9-BED]");
	        System.out.println("ENTER THE NUMBER OF VALUABLES LOST CONSIDERING THE ABOVE LIST: ");
			   int lost3=sc.nextInt();
			   long sum3=0;
			   
			   while(lost3>0)
			   { 
				   int inp=sc.nextInt();
				   if(!set1.contains(inp))
				   {
				  
				   
				   sum3+=Long.parseLong(Obj2.hmap2.get(Obj.getEmailIDofExistingUser()).get(inp));
				   
			   } 
				   else
			   {
				   System.out.println("YOU HAVE ALREADY MENTIONED THE ITEM");
			   }lost3--;
			    
			   }
	        if(damforflood<Obj.getSqfeetOfHouse())
	        {
	        	sum3+=damforflood*110+Obj.getSqfeetOfHouse()/2;
	        }
	        
	       System.out.print("APPROX AMOUNT THAT CAN BE SANCTIONED FOR FLOOD "+sum3);
	       System.out.println("THE INSURANCE WILL BE APPROVED BY THE SURVEYER");
	       break;
	   case 5:
		   System.out.println("ENTER THE APPOX AREA DAMAGED (in sqft ");
	        int damforelec=sc.nextInt();
	        System.out.println("[1-TV,2-FRIDGE,3-JEWELLERY,4-WASHING-MACHINE,5-CLOTHES,6-SOFAS,7-DINING TABLE,8-CASH,9-BED]");
	        System.out.println("ENTER THE NUMBER OF VALUABLES LOST CONSIDERING THE ABOVE LIST: ");
			   int lost4=sc.nextInt();
			   long sum4=0;
			   
			   while(lost4>0)
			   { 
				   int inp=sc.nextInt();
				   if(!set1.contains(inp))
				   {
				  
				   
				   sum4+=Long.parseLong(Obj2.hmap2.get(Obj.getEmailIDofExistingUser()).get(inp));
				   
			   } 
				   else
			   {
				   System.out.println("YOU HAVE ALREADY MENTIONED THE ITEM");
			   }lost4--;
			    
			   }
	        if(damforelec<Obj.getSqfeetOfHouse())
	        {
	        	sum4+=damforelec*1100+Obj.getSqfeetOfHouse()/2;
	        }
	        
	       System.out.print("AMOUNT THAT CAN BE SANCTIONED FOR ELECTRICITY: "+sum4);
	       break;
	   default:
	       System.out.println("Insurance of this kind cannot be claimed");
	       break;
	       
	       
	}}
}
