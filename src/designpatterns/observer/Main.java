package designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		UndercoverStudent subject = new UndercoverStudent();
		
		subject.add(new Student(subject, "小明"));
		subject.add(new Student(subject, "小李"));
		
		subject.setState("老師來了");
		subject.notifyObservers();
	}

}
