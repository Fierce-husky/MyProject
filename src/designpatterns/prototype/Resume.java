package designpatterns.prototype;

/**
 * 简历类
 * @author liuhao
 *
 */
public class Resume implements Cloneable{
	private String name;
	
	private int age;
	
	private WorkExperience workExperience;
	
	public Resume clone() throws CloneNotSupportedException {
		Resume resume = (Resume) super.clone();
		WorkExperience workExperience = this.workExperience.clone();
		resume.workExperience = workExperience;
		return resume;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	@Override
	public String toString() {
		return "Resume [name=" + name + ", age=" + age + ", workExperience=" + workExperience.getCompany() + "]";
	}
	
}
