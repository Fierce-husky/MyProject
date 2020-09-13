package designpatterns.abstractfactory;

/**
 * oracle用户表操作实现类
 * @author liuhao
 *
 */
public class OracleIUer implements IUser {

	@Override
	public void insertUser() {
		System.out.println("向oracle插入一条用户记录");
	}

}
