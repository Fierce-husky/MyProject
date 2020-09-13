package designpatterns.template;

/**
 * 穷小伙
 * @author liuhao
 *
 */
public class PoorMan extends Woo {

	@Override
	public void tease() {
		System.out.println("搭讪：小姐姐，能加个微信吗？");
	}

	@Override
	public void woo() {
		System.out.println("追求：送你一个我精心制作的卡片作为生日礼物，喜欢吗？");//女孩子心中一万屁草泥马奔腾而过
	}

	@Override
	public void confession() {
		System.out.println("表白：虽然我没钱，但我有一颗爱你的心，你愿意做我女朋友吗？");
	}

}
