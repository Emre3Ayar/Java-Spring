package com.SpEEdysm1des.models;

public class ConsoleModel {
	long id = 0L;
	String consoleName = "";
	String consoleColor = "";
	String consoleImage = "";
	@Override
	public String toString() {
		return "Console [id=" + id + ", consoleName=" + consoleName + ", consoleColor=" + consoleColor + "]";
	}
	public ConsoleModel(long id, String consoleName, String consoleColor, String consoleImage) {
		super();
		this.id = id;
		this.consoleName = consoleName;
		this.consoleColor = consoleColor;
		this.consoleImage = consoleImage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConsoleName() {
		return consoleName;
	}
	public void setConsoleName(String consoleName) {
		this.consoleName = consoleName;
	}
	public String getConsoleColor() {
		return consoleColor;
	}
	public void setConsoleColor(String consoleColor) {
		this.consoleColor = consoleColor;
	}
	public String getConsoleImage() {
		return consoleImage;
	}
	public void setConsoleImage(String consoleImage) {
		this.consoleImage = consoleImage;
	}
	
}
