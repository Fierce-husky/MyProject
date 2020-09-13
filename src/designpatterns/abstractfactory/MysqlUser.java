package designpatterns.abstractfactory;

/**
 * mysql用户表操作实现类
 * @author liuhao
 *
 */
public class MysqlUser implements IUser {

	@Override
	public void insertUser() {
		System.out.println("向mysql插入一条用户记录");
	}

}
