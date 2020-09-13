package designpatterns.interpreter;

public class Main {
	public static void main(String[] args) {
		Context context = new Context("\\d\\d\\c", "22zz");
		Expresstion expresstion = null;
		boolean success = true;
		for (String string : context.getRegList()) {
			switch (string) {
			case "d":
				expresstion = new NumberExpresstion();
				break;
			case "c":
				expresstion = new Letter();		
				break;
			default:
				System.out.println("正则表达式错误");
				break;
			}
			if (expresstion != null ) {
				if (!expresstion.excute(context)) {
					System.out.println("匹配失败");
					success = false;
					break;
				}
			}
		}
		if (success) {
			System.out.println("匹配结果："+context.getResult());
		}
	}
}	
