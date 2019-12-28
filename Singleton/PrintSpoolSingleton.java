package Singleton;

public class PrintSpoolSingleton {
	private static PrintSpoolSingleton singletone = new PrintSpoolSingleton();

	private PrintSpoolSingleton() {
	}

	private PrintSpoolSingleton getInstance() {
		return singletone;
	}

	public void print(String str) {
		System.out.println("Output" + str);
	}

}