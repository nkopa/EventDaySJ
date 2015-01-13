package net.dwgs.eventday.domain;

public class Address {
	private int idAddress;
	
	private String country;
	
	//wojewodztwo
	private String voivodeship;
	
	//miejscowosc
	private String locality;
	
	//nr domu
	private String houseNumber;
	
	//nr mieszkania
	private String flatNumber;

	//kod pocztowy
	private String postcode;

	public String getCountry() {
		return country;
	}

	
	//GET/SET ATRYBUTY
	public void setCountry(String country) {
		this.country = country;
	}


	public String getVoivodeship() {
		return voivodeship;
	}


	public void setVoivodeship(String voivodeship) {
		this.voivodeship = voivodeship;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getFlatNumber() {
		return flatNumber;
	}


	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public int getIdAddress() {
		return idAddress;
	}


	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

}
