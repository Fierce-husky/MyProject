package designpatterns.observer;

/**
 * 观察者实现类-学生
 * @author liuhao
 *
 */
public class Student implements Observer {
	private Subject subject;
	private String name;

	public Student(Subject subject, String name) {
		super();
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(subject.getState() + "," + name + "注意隐蔽！");
	}

}
