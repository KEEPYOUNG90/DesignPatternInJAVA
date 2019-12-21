//영업을 하는 A씨는 고객관리를 하기 위해 국내와 국외 고객에 대한 주소 및 전화번호를 국가에 맞게 생성하고 싶다

public class Client {
	public void main(String[] args) throws Exception{
		KorZip korZip = new KorZip; 
		KorPhoneNum korPhoneNum = new KorPhoneNum;
		System.out.println("지역번호가 " + NATION_CODE +"인 전화번호 입니다.")
		Client client = new Client();
		korZip = client.createKorZip("Korea");
		korPhoneNum = client.createPhoneNum("Korea")
		
		System.out.println("주소" + korZip.getTheirAddress());
		System.out.println("전화번호 : (" + korPhoneNum.getNationCode() + ") " + korPhoneNum.getPhoneNum());
	}

	public KRAddress createAddress(String countryType) {
		KorZip korZip = null;
		
		if (countryType.equals("Korea")) {
			korZip = new KorZip();
			
			korZip.setZipCode("10005");
			korZip.setNation("대한민국");
			korZip.setCity("서울");
			korZip.setRegion("00구");
			korZip.setAddress("00로 00길");
		}
		
		return korZip;
	}

	public KorPhoneNum createPhoneNum(String NationType) {
		KorPhoneNum korPhoneNum = null;
		
		if (countryType.equals("Korea")) {
			korPhoneNum = new KorPhoneNum();
			
			korPhoneNum.setPhoneNum("02-2002-2002");
		}
		
		return korPhoneNum;
	}
	
}