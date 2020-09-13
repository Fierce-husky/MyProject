package designpatterns.abstractfactory;

/**
 * oracle工厂实现类
 * @author liuhao
 *
 */
public class OracleFactory implements IFactory {

	@Override
	public IUser createIUer() {
		return new OracleIUer();
	}

	@Override
	public IProject createIProject() {
		return new OracleIProject();
	}

}
