package designpatterns.decorator;

/**
 * 装饰实现类T恤
 * @author liuhao
 *
 */
public class TShirts extends Decorator {

	public TShirts(Person person) {
		super(person);
	}

	public void show() {
		System.out.print("T恤");
		super.show();
	}
}
