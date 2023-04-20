package com.unipi.talepis.java20235;


public class PapiMember{
    /**
	 * 
	 */
	private String am;
    private String name;
    //private String property;

    public PapiMember() {
    }

    public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String prettyPrint() {
		return "am= "+am+" name= "+name;
	}
	public PapiMember(String am, String name) {
        this.am = am;
        this.name = name;
    }
	 
}
