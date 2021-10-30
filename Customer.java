

import java.util.Scanner;
public class Customer {
	 private String CustomerName;
	 private String AccountID;
	 private String Address;
	 private String contactNumber;
	 
	
	public Customer(String CustomerName, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		this.CustomerName=CustomerName;
		AccountID=string2;
		Address=string3;
		contactNumber=string4;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}
	public String getaccountId() {
		return AccountID;
	}
	public void setaccountId(String accountId) {
		this.AccountID = accountId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	 
	
	public String getphoneno() {
		return contactNumber;
		
		
	}
	
	public void setPhoneno(String contactNo) {
		this.contactNumber = contactNo;
	}
	
		
	
	
}