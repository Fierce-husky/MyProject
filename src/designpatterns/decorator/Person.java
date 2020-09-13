package designpatterns.decorator;

/**
 * 人类（被装饰类）
 * @author liuhao
 *
 */
public class Person {
	private String name;

	public void show() {
		System.out.print("的" + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
