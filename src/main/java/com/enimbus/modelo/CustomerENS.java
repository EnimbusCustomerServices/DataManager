package com.enimbus.modelo;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="CustomerENS")
public class CustomerENS {

	private String idCustomer;
	private String nickName;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String firstLastName;
	private String secondLastName;
	private String identificationNumber;
	private String businessName;
	private String legalIdentification;
	private String country;
	private String state;
	private String city;
	private String phoneNumer;
	private String phoneNumer2;
	private String mobileNumeber;
	private String mobileNumer2;
	private Date dateInit;
	
	public CustomerENS() {
		// TODO Auto-generated constructor stub
		
	}
	
	@DynamoDBHashKey(attributeName = "idCustomer")
    @DynamoDBAutoGeneratedKey
	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	@DynamoDBHashKey(attributeName = "nickName")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@DynamoDBAttribute(attributeName = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@DynamoDBAttribute(attributeName = "secondName")
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@DynamoDBAttribute(attributeName = "thirdName")
	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	@DynamoDBAttribute(attributeName = "firstLastName")
	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}
	@DynamoDBAttribute(attributeName = "secondLastName")
	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	@DynamoDBAttribute(attributeName = "identificationNumber")
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	@DynamoDBAttribute(attributeName = "businessName")
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	@DynamoDBAttribute(attributeName = "legarlIdentification")
	public String getLegalIdentification() {
		return legalIdentification;
	}

	public void setLegalIdentification(String legalIdentification) {
		this.legalIdentification = legalIdentification;
	}
	@DynamoDBAttribute(attributeName = "county")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@DynamoDBAttribute(attributeName = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@DynamoDBAttribute(attributeName = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@DynamoDBAttribute(attributeName = "proneNumber")
	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	@DynamoDBAttribute(attributeName = "proneNumber2")
	public String getPhoneNumer2() {
		return phoneNumer2;
	}

	public void setPhoneNumer2(String phoneNumer2) {
		this.phoneNumer2 = phoneNumer2;
	}
	@DynamoDBAttribute(attributeName = "mobileNumber")
	public String getMobileNumeber() {
		return mobileNumeber;
	}

	public void setMobileNumeber(String mobileNumeber) {
		this.mobileNumeber = mobileNumeber;
	}
	@DynamoDBAttribute(attributeName = "mobileNumber2")
	public String getMobileNumer2() {
		return mobileNumer2;
	}

	public void setMobileNumer2(String mobileNumer2) {
		this.mobileNumer2 = mobileNumer2;
	}
	@DynamoDBAttribute(attributeName = "dateInit")
	public Date getDateInit() {
		return dateInit;
	}

	public void setDateInit(Date datainit) {
		this.dateInit = datainit;
	}

	

}