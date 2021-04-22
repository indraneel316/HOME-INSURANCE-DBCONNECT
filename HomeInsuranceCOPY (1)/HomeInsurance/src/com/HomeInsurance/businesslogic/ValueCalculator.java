package com.HomeInsurance.businesslogic;

import com.HouseInsurace.model.Customer;

public class ValueCalculator {

	 public long valcal(Customer Obj)
	 {
		 return Obj.getNewUserTvprice()+Obj.getNewUserFridgePrice()+Obj.getNewUserJewelleryPrice()+Obj.getNewUserSofaPrice()+
				 Obj.getNewUserClothprice()+Obj.getNewUserCash()+Obj.getNewUserDtPrice()+Obj.getNewUserWmPrice();}
}
