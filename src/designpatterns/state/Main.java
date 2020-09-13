package designpatterns.state;

public class Main {

	public static void main(String[] args) {
		Work work = new Work();
		work.setTime(9);
		work.request();
		
		work.setTime(12);
		work.request();
		
		work.setTime(13);
		work.request();
		
		work.setTime(15);
		work.request();
		
		work.setTime(16);
		work.request();
		
		work.setTime(19);
		work.request();
		
		work.setTime(20);
		work.request();
	}

}
