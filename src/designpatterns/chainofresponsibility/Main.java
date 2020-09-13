package designpatterns.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		InfoLogger info = new InfoLogger(Logger.INFO);
		DebugLogger debug = new DebugLogger(Logger.DEBUG);
		ErrorLogger error = new ErrorLogger(Logger.ERROR);
		info.setLogger(debug);
		debug.setLogger(error);
		
		System.out.println("debug");
		info.log(Logger.DEBUG, "debug级别日志消息");
		
		System.out.println("error");
		info.log(Logger.ERROR, "error级别日志消息");
	}

}
