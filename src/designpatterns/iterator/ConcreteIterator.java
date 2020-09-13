package designpatterns.iterator;

/**
 * 迭代器实现类
 * @author liuhao
 *
 */
public class ConcreteIterator implements Iterator {

	private ConcreteAggregate aggregate;
	
	private int index = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object next() {
		Object res = null;
		if (index < aggregate.count()) {
			res = aggregate.get(index);
		}
		index++;
		return res;
	}

	@Override
	public boolean hasNext() {
		return index < aggregate.count();
	}

}
