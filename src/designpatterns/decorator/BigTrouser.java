package designpatterns.decorator;

/**
 * 装饰实现类裤子
 * @author liuhao
 *
 */
public class BigTrouser extends Decorator {

	public BigTrouser(Person person) {
		super(person);
	}
	
	public void show() {
		System.out.print("大裤衩");
		super.show();
	}
}
