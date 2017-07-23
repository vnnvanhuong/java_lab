package vn.nvanhuong.javalab.hellojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name = "data")
@SessionScoped
public class Data {
	private String greeting = "Hello JSF";

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}