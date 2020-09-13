package designpatterns.iterator;

/**
 * 聚合对象抽象类
 * @author liuhao
 *
 */
public abstract class Aggregate {
	public abstract Iterator createIterator();
}
