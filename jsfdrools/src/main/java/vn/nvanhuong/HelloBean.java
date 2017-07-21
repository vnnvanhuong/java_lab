package vn.nvanhuong;

import javax.faces.bean.ManagedBean;
 
@ManagedBean(name = "helloBean")
public class HelloBean {
	public HelloBean() {
		this.greeting = "Hello JSF - Myfaces";
	}

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}