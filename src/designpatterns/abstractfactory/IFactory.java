package designpatterns.abstractfactory;

/**
 * 抽象工厂接口
 * @author liuhao
 *
 */
public interface IFactory {
	IUser createIUer();

	IProject createIProject();

}
