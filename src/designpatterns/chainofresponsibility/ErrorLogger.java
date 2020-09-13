package designpatterns.chainofresponsibility;

public class ErrorLogger extends Logger {

	public ErrorLogger(int level) {
		super(level);
	}

	@Override
	public void log(int level, String message) {
		if (this.level <= level) {
			System.out.println("error："+message);
		}
		if (this.logger != null) {
			this.logger.log(level, message);
		}

	}

}
