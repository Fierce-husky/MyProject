package designpatterns.abstractfactory;

/**
 * mysql项目表操作实现类
 * @author liuhao
 *
 */
public class MysqlProject implements IProject {

	@Override
	public void insertProject() {
		System.out.println("向mysql插入一条项目记录");
	}

}
