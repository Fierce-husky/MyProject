package designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合实现类
 * @author liuhao
 *
 */
public class ConcreteAggregate extends Aggregate{

	private List<Object> items = new ArrayList<Object>();
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count() {
		return items.size();
	}
	
	public Object get(int index) {
		return items.get(index);
	}
	
	public boolean add(Object object) {
		return items.add(object);
	}
}
