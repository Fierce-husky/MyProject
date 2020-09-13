package designpatterns.state;

/**
 * 下午状态
 * @author liuhao
 *
 */
public class AfterNoonState implements State {

	@Override
	public void handle(Work work) {
		if (work.getTime() < 18) {
			System.out.println("当前时间：" + work.getTime() + " 下午犯困，工作质量下降！！！");
		}else {
			System.out.println("###进入下班状态###");
			work.setState(new RestState());
		}
	}

}
