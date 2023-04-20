package com.unipi.talepis.java20235;

public class Student extends PapiMember{
	/**
	 * 
	 */
	private String property;
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Student(){super();}
	 
	public Student(String am, String name,String property) {
		//this.am = am;
		//this.name = name;
		super(am,name);
		this.setProperty(property);
		}	
	
	public String prettyPrint() {
		return super.prettyPrint()+" property= "+property;
				
	}
}
