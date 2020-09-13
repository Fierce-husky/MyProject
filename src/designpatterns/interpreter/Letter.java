package designpatterns.interpreter;

public class Letter extends Expresstion {

	@Override
	public boolean excute(Context context) {
		if (context.getChars().get(0).matches("[a-zA-Z]")) {
			context.getResult().add(context.getChars().get(0));
			context.getChars().remove(0);
			return true;
		}else {
			return false;
		}
		
	}

}
