package designpatterns.bridge;

/**
 * 独立的形状抽象类
 * @author liuhao
 *
 */
public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public abstract void drow();
}
