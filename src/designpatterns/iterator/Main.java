package designpatterns.iterator;

public class Main {

	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.add("1");
		aggregate.add("2");
		aggregate.add("3");
		aggregate.add("4");
		aggregate.add("5");
		
		Iterator iterator = aggregate.createIterator();
		Object o;
		while (iterator.hasNext()) {
			o = iterator.next();
			System.out.println(o);
		}
	}

}
