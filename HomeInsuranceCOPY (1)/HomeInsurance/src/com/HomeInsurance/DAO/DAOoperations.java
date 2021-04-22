package com.HomeInsurance.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.HouseInsurace.model.Customer;

public class DAOoperations {
       
	  public void database(Customer Obj,long totworth,double markval,int yearbuilt)
	  {    
		  try{  
			  Class.forName("com.mysql.jdbc.Driver");  
			    
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");  
			    
			  PreparedStatement stmt=con.prepareStatement("insert into customercopy values(?,?,?,?,?,?,?,?,?)");  
			  stmt.setInt(1,Obj.getUserId());//1 specifies the first parameter in the query  
			  stmt.setString(2,Obj.getNewUserEmailId());  
			  stmt.setString(3, Obj.getNewUserDob());
			  stmt.setString(4,Obj.getNewUserAddress());
			  stmt.setString(5,Obj.getNewUserPhoneNumber());
			  System.out.println("THE PHONE NUMNER: "+Obj.getNewUserPhoneNumber());
			  stmt.setDouble(6,Obj.getSqfeetOfHouse());
			  stmt.setDouble(7,markval);
			  stmt.setInt(8,yearbuilt);
			  stmt.setDouble(9,totworth);
			  
			    
			  int i=stmt.executeUpdate();
			    
			  con.close();  
			    
			  }catch(Exception e){ System.out.println(e);}  
			    
		  
	  }
	
	
	  
	public void policyDetails(int userID,int choosePolicy, double houseworth, int insuranceCalculator,String name,double sqfeet,double marketvalue) {
		// TODO Auto-generated method stub
		 try{  
			  Class.forName("com.mysql.jdbc.Driver");  
			    
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");  
			    
			  PreparedStatement stmt=con.prepareStatement("insert into policydetails values(?,?,?,?,?,?,?,?,?,?,?)");  
			  stmt.setInt(1,userID);//1 specifies the first parameter in the query  
			  stmt.setString(2,name);
			  stmt.setDouble(3,houseworth);  
			  stmt.setInt(4, insuranceCalculator);
			  stmt.setString(5, "ACTIVE");
	
			  if(choosePolicy==1)
			  {
				  stmt.setString(6,"1-Year Policy");
				  stmt.setString(11,"22-4-2022");
			  }
			  else
			  {
				  stmt.setString(6,"5-Year Policy");
				  stmt.setString(11,"22-4-2026");
			  }
			  stmt.setDouble(7, sqfeet);
			  stmt.setDouble(8,marketvalue);
			  stmt.setString(9,"NOT CLAIMED");
			  stmt.setInt(10,userID+1350);
			  
			  int i=stmt.executeUpdate();  
			  //System.out.println(i+" records inserted2");  
			    
			  con.close();  
			    
			  }catch(Exception e){ System.out.println(e);
	}
	}
	public void claim(String name)
	{
		 try{  
			  Class.forName("com.mysql.jdbc.Driver");  
			    
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root"); 
			  PreparedStatement stmt=con.prepareStatement("update policydetails set claimstatus= ?,policy_status= ? where UserName=?"); 
			  stmt.setString(1,"CLAIMED");
			  stmt.setString(2,"NOTACTIVE");
			  stmt.setString(3, name);
			  int i=stmt.executeUpdate();  
			  //System.out.println(i+" records inserted2");  
			    
			  con.close();  
			    
			  }catch(Exception e){ System.out.println(e);
	}
	}
	
	}
