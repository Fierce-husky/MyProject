package designpatterns.builder;

/**
 * 指挥者类
 * @author liuhao
 *
 */
public class Director {
	/**
	 * 控制构建过程
	 * @param builder
	 */
	public void construct(Builder builder) {
		builder.buildEngine();
		builder.buildTire();
	}
}
