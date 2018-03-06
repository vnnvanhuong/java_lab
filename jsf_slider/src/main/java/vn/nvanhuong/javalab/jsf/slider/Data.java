package vn.nvanhuong.javalab.jsf.slider;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "data")
@SessionScoped
public class Data {
	private Integer age;
	private Integer ageSlider;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAgeSlider() {
		return ageSlider;
	}

	public void setAgeSlider(Integer ageSlider) {
		this.ageSlider = ageSlider;
	}

}