package designpatterns.template;

/**
 * 富二代
 * @author liuhao
 *
 */
public class RichMan extends Woo {

	@Override
	public void tease() {
		System.out.println("搭讪：小姐姐，你的男朋友掉了.");
	}

	@Override
	public void woo() {
		System.out.println("追求：送你一个lv限量包包作为生日礼物，喜欢么？");
	}

	@Override
	public void confession() {
		System.out.println("表白：999朵玫瑰，做我女朋友吧！");
	}

}
