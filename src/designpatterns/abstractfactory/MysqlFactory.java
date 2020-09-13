package designpatterns.abstractfactory;

/**
 * mysql工厂实现类
 * @author liuhao
 *
 */
public class MysqlFactory implements IFactory {

	@Override
	public IUser createIUer() {
		return new MysqlUser();
	}

	@Override
	public IProject createIProject() {
		return new MysqlProject();
	}

}
