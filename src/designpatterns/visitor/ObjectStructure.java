package designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<People> elements = new ArrayList<People>();
	
	public void add(People people) {
		elements.add(people);
	}
	
	public void visit(Visitor visitor) {
		for (People people : elements) {
			people.accept(visitor);
		}
	}
}
