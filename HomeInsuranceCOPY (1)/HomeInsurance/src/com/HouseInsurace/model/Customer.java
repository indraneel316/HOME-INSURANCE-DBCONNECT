package com.HouseInsurace.model;
public class Customer {
       private String emailIDofExistingUser;
       private String passwordOfExistingUser;
       private String newUserEmailId;
       private String newUserPassword;
       private String newUserDob;
       private String newUserAddress;
       private String newUserPhoneNumber;
       private long newUserTvprice;
       private long newUserFridgePrice;
       private long newUserJewelleryPrice;
       private int userId; 
       public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private double marketValue;
   	private long newUserWmPrice;
    private long newUserClothprice;
    private long newUserSofaPrice;
    private long newUserDtPrice;
    private long newUserCash;
    private long newUserBedPrice;
    private double sqfeetOfHouse;
       public double getSqfeetOfHouse() {
		return sqfeetOfHouse;
	}
	public void setSqfeetOfHouse(double sqfeetOfHouse) {
		this.sqfeetOfHouse = sqfeetOfHouse;
	}
	public long getNewUserTvprice() {
		return newUserTvprice;
	}
	public void setNewUserTvprice(String newUserTvprice) {
		
		this.newUserTvprice = Long.parseLong(newUserTvprice);
	}
	public long getNewUserFridgePrice() {
		return newUserFridgePrice;
	}
	public void setNewUserFridgePrice(String newUserFridgePrice) {
		this.newUserFridgePrice = Long.parseLong(newUserFridgePrice);
	}
	public long getNewUserJewelleryPrice() {
		return newUserJewelleryPrice;
	}
	public void setNewUserJewelleryPrice(String newUserJewelleryPrice) {
		this.newUserJewelleryPrice = Long.parseLong(newUserJewelleryPrice);
	}
	public long getNewUserWmPrice() {
		return newUserWmPrice;
	}
	public void setNewUserWmPrice(String newUserWmPrice) {
		this.newUserWmPrice =Long.parseLong(newUserWmPrice);
	}
	public long getNewUserClothprice() {
		return newUserClothprice;
	}
	public void setNewUserClothprice(String newUserClothprice) {
		this.newUserClothprice = Long.parseLong(newUserClothprice);}
	
	public long getNewUserSofaPrice() {
		return newUserSofaPrice;
	}
	public void setNewUserSofaPrice(String newUserSofaPrice) {
		this.newUserSofaPrice =  Long.parseLong(newUserSofaPrice);
	}
	public long getNewUserDtPrice() {
		return newUserDtPrice;
	}
	public void setNewUserDtPrice(String newUserDtPrice) {
		this.newUserDtPrice = Long.parseLong(newUserDtPrice);
	}
	public long getNewUserCash() {
		return newUserCash;
	}
	public void setNewUserCash(String newUserCash) {
		this.newUserCash = Long.parseLong(newUserCash);
	}
	public long getNewUserBedPrice() {
		return newUserBedPrice;
	}
	public void setNewUserBedPrice(String newUserBedPrice) {
		this.newUserBedPrice =  Long.parseLong(newUserBedPrice);
	}

	public String getNewUserEmailId() {
		return newUserEmailId;
	}
	public String getNewUserDob() {
		return newUserDob;
	}
	public void setNewUserDob(String newUserDob) {
		this.newUserDob = newUserDob;
	}
	public String getNewUserAddress() {
		return newUserAddress;
	}
	public void setNewUserAddress(String newUserAddress) {
		this.newUserAddress = newUserAddress;
	}
	public String getNewUserPhoneNumber() {
		return newUserPhoneNumber;
	}
	public void setNewUserPhoneNumber(String newUserPhoneNumber) {
		this.newUserPhoneNumber = newUserPhoneNumber;
	}
	public void setNewUserEmailId(String newUserEmailId) {
		this.newUserEmailId = newUserEmailId;
	}
	public String getNewUserPassword() {
		return newUserPassword;
	}
	public void setNewUserPassword(String newUserPassword) {
		this.newUserPassword = newUserPassword;
	}
	public String getEmailIDofExistingUser() {
		return emailIDofExistingUser;
	}
	public void setEmailIDofExistingUser(String emailIDofExistingUser) {
		this.emailIDofExistingUser = emailIDofExistingUser;
	}
	public String getPasswordOfExistingUser() {
		return passwordOfExistingUser;
	}
	public void setPasswordOfExistingUser(String passwordOfExistingUser) {
		this.passwordOfExistingUser = passwordOfExistingUser;
	}
	public void setMarketValue(double marketvalue) {
		// TODO Auto-generated method stub
		this.marketValue=marketvalue;
		
	}
	public double getMarketValue()
	{
		return marketValue;
	}
       
  
	
}
