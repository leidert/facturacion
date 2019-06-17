package com.sofka.facturacion.domain.entities;


public class Factura {
    private String nameClient;
    private String leadingCompany;
    private String city;
    private int phoneClient;
    private String paymentCurrency;
    private String projectDescription;
    private String hourAmount;
    private double fullCharge;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getHourAmount() {
        return hourAmount;
    }

    public void setHourAmount(String hourAmount) {
        this.hourAmount = hourAmount;
    }

	}

    public double getFullCharge() {
		return fullCharge;
	}

	public void setFullCharge(double fullCharge) {
		this.fullCharge = fullCharge;
	}

    public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	

    public String getPaymentCurrency(){
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentC){
        this.paymentCurrency = paymentC;
    }

    public int getPhoneClient(){
        return phoneClient;
	}

	public void setPhoneClient(int phoneClient) {
		this.phoneClient = phoneClient;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLeadingCompany() {
		return leadingCompany;
	}

	public void setLeadingCompany(String leadingCompany) {
		this.leadingCompany = leadingCompany;
	}

	



}