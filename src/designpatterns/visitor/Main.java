package designpatterns.visitor;

public class Main {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new Man("男人"));
		objectStructure.add(new Woman("女人"));
		
		Visitor success = new SuccessVisitor("成功");
		objectStructure.visit(success);
		
		Visitor fail = new FailVisitor("失败");
		objectStructure.visit(fail);
		
		Visitor amativeness = new AmativenessVisitor("恋爱");
		objectStructure.visit(amativeness);
	}

}
