package designpatterns.state;

/**
 * 上午状态
 * @author liuhao
 *
 */
public class ForenoonState implements State{

	@Override
	public void handle(Work work) {
		if (work.getTime() < 12) {
			System.out.println("当前时间：" + work.getTime() + " 上午，精力充沛，工作效率高！！！");
		}else {
			System.out.println("###进入中午状态###");
			work.setState(new NoonState());
		}
	}

}
