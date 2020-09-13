package designpatterns.decorator;

/**
 * 装饰类父类
 * @author liuhao
 *
 */
public class Decorator extends Person {
	protected Person person;

	public Decorator(Person person) {
		this.person = person;
	}
	
	public void show() {
		if (person != null) {
			person.show();
		}
	};
}
