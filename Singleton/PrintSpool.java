/**PrintSpool
*오직 한 개의 프린트스풀 생성
*전연변수로 인스턴스 접근
*객체 임의로 생성시 에러 발생
*/

public class PrintSpool(){
	public static int instanseNum = 0;
	public static PrintSpool printS;

	public PrintSppol(){
		instanceNum++;
		if(instanceNum > 1){
		throw new RuntimeException("2개 이상의 객체 생성 불가");
		}
	}

	public void print(String str){
		system.out.plintln("Output" + str);
	}
}