package designpatterns.visitor;

/**
 * 访问者抽象类
 * @author liuhao
 *
 */
public abstract class Visitor {
	protected String name;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public abstract void getManReply(Man man);
	public abstract void getWomanReply(Woman woman);
}
