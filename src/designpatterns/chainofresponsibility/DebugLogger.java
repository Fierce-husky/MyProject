package designpatterns.chainofresponsibility;

public class DebugLogger extends Logger {

	public DebugLogger(int level) {
		super(level);
	}

	@Override
	public void log(int level, String message) {
		if (this.level <= level) {
			System.out.println("debug："+message);
		}
		if (this.logger != null) {
			this.logger.log(level, message);
		}

	}

}
