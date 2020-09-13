package designpatterns.chainofresponsibility;

public abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected Logger logger;
	protected int level;

	public Logger(int level) {
		this.level = level;
	}

	
	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public abstract void log(int level, String message);
}
