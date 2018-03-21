package vn.nvanhuong.javalab.primefacestheme;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "data")
@SessionScoped
public class Data {
	private Boolean radio = true;
	private Boolean checkboxPrimary = true;
	private Boolean checkboxSecondary = false;
	private String inputText;
	private String combobox;
	private Date calendar;

	public Boolean getRadio() {
		return radio;
	}

	public void setRadio(Boolean radio) {
		this.radio = radio;
	}

	public Boolean getCheckboxPrimary() {
		return checkboxPrimary;
	}

	public void setCheckboxPrimary(Boolean checkboxPrimary) {
		this.checkboxPrimary = checkboxPrimary;
	}

	public Boolean getCheckboxSecondary() {
		return checkboxSecondary;
	}

	public void setCheckboxSecondary(Boolean checkboxSecondary) {
		this.checkboxSecondary = checkboxSecondary;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public String getCombobox() {
		return combobox;
	}

	public void setCombobox(String combobox) {
		this.combobox = combobox;
	}

	public Date getCalendar() {
		return calendar;
	}

	public void setCalendar(Date calendar) {
		this.calendar = calendar;
	}
	
	
	
	

}