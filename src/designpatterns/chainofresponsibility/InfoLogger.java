package designpatterns.chainofresponsibility;

public class InfoLogger extends Logger {

	
	public InfoLogger(int level) {
		super(level);
	}

	@Override
	public void log(int level, String message) {
		if (this.level <= level) {
			System.out.println("info："+message);
		}
		if (this.logger != null) {
			this.logger.log(level, message);
		}
	}

}
