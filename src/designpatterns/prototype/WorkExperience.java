package designpatterns.prototype;

/**
 * 工作经历类
 * @author liuhao
 *
 */
public class WorkExperience implements Cloneable{
	private String company;
	
	
	public WorkExperience clone() throws CloneNotSupportedException {
		return (WorkExperience)super.clone();
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
