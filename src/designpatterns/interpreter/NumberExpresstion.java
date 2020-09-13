package designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class NumberExpresstion extends Expresstion {

	private List<Integer> list = new ArrayList<Integer>();
	
	public NumberExpresstion() {
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
	}
	@Override
	public boolean excute(Context context) {
		try {
			Integer.valueOf(context.getChars().get(0));
			context.getResult().add(context.getChars().get(0));
			context.getChars().remove(0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}
}
