package com.SpEEdysm1des.models;

public class BatteryModel {
	long id = 0L;
	String batteryCode = "";
	String consoleImage = "";
	String batteryDescription = "";
	
	@Override
	public String toString() {
		return "BatteryModel [id=" + id + ", batteryCode=" + batteryCode + ", consoleImage=" + consoleImage
				+ ", batteryDescription=" + batteryDescription + "]";
	}
	public BatteryModel(long id, String batteryCode, String consoleImage, String batteryDescription) {
		super();
		this.id = id;
		this.batteryCode = batteryCode;
		this.consoleImage = consoleImage;
		this.batteryDescription = batteryDescription;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getbatteryCode() {
		return batteryCode;
	}
	public void setbatteryCode(String batteryCode) {
		this.batteryCode = batteryCode;
	}
	
	public String getConsoleImage() {
		return consoleImage;
	}
	public void setConsoleImage(String consoleImage) {
		this.consoleImage = consoleImage;
	}
	
	public String getBatteryDescription() {
		return batteryDescription;
	}
	public void setBatteryDescription(String batteryDescription) {
		this.batteryDescription = batteryDescription;
	}
	
}
