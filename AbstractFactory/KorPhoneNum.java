//영업을 하는 A씨는 고객관리를 하기 위해 국내와 국외 고객에 대한 주소 및 전화번호를 국가에 맞게 생성하고 싶다

public class KorPhoneNum{
	private static final String NATION_CODE = "82";
	private String phoneNum;

	public String getNationCode;() {
		return NATION_CODE;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}