public class PrintSpoolSingleton{
	private static PrintSpoolSingleton singletone = new PrintSpoolSingleton();

	private PrintSpoolSingleton(){
	}

	private PrintSpoolSingleton getInstance(){
	return singletone;
	}

	public void print(String str){
		system.out.println("Output" + str);
	}

}