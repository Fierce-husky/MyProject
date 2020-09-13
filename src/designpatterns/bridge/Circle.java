package designpatterns.bridge;

/**
 * 圆形实现类
 * @author liuhao
 *
 */
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void drow() {
		System.out.println("使用"+color.getColor()+"画一个○");
	}

}
