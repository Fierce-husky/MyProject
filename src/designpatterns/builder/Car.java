package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类-汽车
 * @author liuhao
 *
 */
public class Car {
	//汽车配件
	private List<String> compents = new ArrayList<String>();
	
	
	public List<String> getCompents() {
		return compents;
	}


	public void show() {
		System.out.println(compents);
	}
}
