package in.ajay.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable{

	private Integer sno;
	private String name;
	private String countryCode;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
