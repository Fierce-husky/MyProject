package designpatterns.prototype;

public class Test implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume();
		resume.setName("张三");
		resume.setAge(18);
		WorkExperience experience = new WorkExperience();
		resume.setWorkExperience(experience);
		experience.setCompany("alibaba");
		
		Resume resume2 = resume.clone();
		resume2.setName("李四");
		resume2.setAge(28);
		resume2.getWorkExperience().setCompany("huawei");
		
		System.out.println(resume);
		System.out.println(resume2);
	}
}
