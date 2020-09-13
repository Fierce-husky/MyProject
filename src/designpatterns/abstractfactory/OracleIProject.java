package designpatterns.abstractfactory;

/**
 * oracle项目表操作实现类
 * @author liuhao
 *
 */
public class OracleIProject implements IProject {

	@Override
	public void insertProject() {
		System.out.println("向oracle插入一条项目记录");
	}

}
