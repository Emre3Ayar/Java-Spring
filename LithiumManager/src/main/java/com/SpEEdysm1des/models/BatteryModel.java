package com.SpEEdysm1des.models;

public class BatteryModel {
	long id = 0L;
	String batteryCode = "";
	String consoleImage = "";
	@Override
	public String toString() {
		return "Battery [id=" + id + ", batteryCode=" + batteryCode + "]";
	}
	public BatteryModel(long id, String batteryCode, String consoleImage) {
		super();
		this.id = id;
		this.batteryCode = batteryCode;
		this.consoleImage = consoleImage;
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
	
}
