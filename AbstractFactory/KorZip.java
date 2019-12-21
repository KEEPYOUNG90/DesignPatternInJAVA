//영업을 하는 A씨는 고객관리를 하기 위해 국내와 국외 고객에 대한 주소 및 전화번호를 국가에 맞게 생성하고 싶다

public class KorZip{
	private static final String BLANK = " ";
	private String zipCode;
	private String nation;
	private String city;
	private String region;
	private String address;

	public String getZipCode(){
		return zipCode;
	}

	public String setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public String getNation;() {
		return nation;;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTheirAddress() {
		return zipCode + BLANK + city + BLANK + region + BLANK + address;
	}
}