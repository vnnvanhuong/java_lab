package vn.nvanhuong.javalab.jsf.dateformat;


import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
 
@ManagedBean(name = "data")
@SessionScoped
public class Data {
	private String greeting = "Hello JSF";
	private Date birthdate;
	
	public void onCalculate(AjaxBehaviorEvent event) {
	    //dosomething;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}