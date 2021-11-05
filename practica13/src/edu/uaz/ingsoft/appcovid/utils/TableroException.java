package edu.uaz.ingsoft.appcovid.utils;

public class TableroException extends Exception {
	private int index;

	public TableroException(String message, int index){
		super(message);
		this.index = index;
	}

	public int getIndex(){
		return index;
	}
}