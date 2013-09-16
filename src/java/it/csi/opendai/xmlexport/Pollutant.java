// $Id: Pollutant.java,v 1.2 2013/07/26 13:14:09 pfvallosio Exp $

package it.csi.opendai.xmlexport;

public class Pollutant {

	private int id;
	private String acronym;
	private String name;
	private String URI;

	public Pollutant(int id, String acronym, String name, String uRI) {
		this.id = id;
		this.acronym = acronym;
		this.name = name;
		URI = uRI;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getURI() {
		return URI;
	}

	public void setURI(String uRI) {
		URI = uRI;
	}

}
