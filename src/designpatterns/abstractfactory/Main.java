package designpatterns.abstractfactory;

public class Main {
	public static void main(String[] args) {
		IFactory mysqlFactory = new MysqlFactory();
		IUser user = mysqlFactory.createIUer();
		IProject project = mysqlFactory.createIProject();
		user.insertUser();
		project.insertProject();
		
		IFactory oracleFactory = new OracleFactory();
		IUser oUser = oracleFactory.createIUer();
		IProject oProject = oracleFactory.createIProject();
		oUser.insertUser();
		oProject.insertProject();
	}
}
