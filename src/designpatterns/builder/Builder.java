package designpatterns.builder;

/**
 * 构建接口
 * @author liuhao
 *
 */
public interface Builder {
	/*
	 * 构建轮胎
	 */
	void buildTire();
	
	/*
	 * 构建发动机
	 */
	void buildEngine();
	
	//其他组件省略
	
	/**
	 * 获取组装后的对象
	 */
	Car getCar();
}
