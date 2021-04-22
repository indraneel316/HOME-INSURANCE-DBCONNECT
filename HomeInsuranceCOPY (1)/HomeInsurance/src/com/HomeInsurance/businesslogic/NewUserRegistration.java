package com.HomeInsurance.businesslogic;

import java.util.*;

import com.HouseInsurace.model.Customer;


public class NewUserRegistration {
	public static HashMap<String,String>hmap =new HashMap<String,String>();
	public static HashMap<String,List<String>>hmap2 =new HashMap<String,List<String>>();
	public static HashMap<String,Double>hmap3 =new HashMap<String,Double>();
	public static HashMap<String,Customer>hmap4 =new HashMap<String,Customer>();
	public static HashMap<String,Integer>claimstat =new HashMap<String,Integer>();
	public static HashMap<String,Integer>applystat =new HashMap<String,Integer>();
	public void addNewUser(Customer Obj)
	{   if(!hmap.containsKey(Obj.getNewUserEmailId()))
		hmap.put(Obj.getNewUserEmailId(),Obj.getNewUserPassword());
	else
	{
		System.out.println("USER ALREADY EXISTS");
	}
	}
	public void claim(Customer Obj,String val)
	{  String valarray[]=val.split(" ");
	   List<String>valfinal=new ArrayList<>();
	   valfinal=Arrays.asList(valarray);
		hmap2.put(Obj.getNewUserEmailId(),valfinal);
	}
	public void apply(Customer Obj,long value,double houseprice)
	{ 
		double finval=value+houseprice;
		hmap3.put(Obj.getNewUserEmailId(),finval);
		
	}
	
	

}
