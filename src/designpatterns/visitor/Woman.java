package designpatterns.visitor;

public class Woman extends People {

	public Woman(String tpye) {
		super(tpye);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.getWomanReply(this);
	}

}
