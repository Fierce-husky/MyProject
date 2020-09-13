package designpatterns.state;

/**
 * 工作类
 * @author liuhao
 *
 */
public class Work {
	private State state;

	private int time;

	public Work() {
		this.state = new ForenoonState();;
	}
	
	public void request() {
		state.handle(this);
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
