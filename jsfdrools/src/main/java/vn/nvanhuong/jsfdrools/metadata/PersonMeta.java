package vn.nvanhuong.jsfdrools.metadata;

import vn.nvanhuong.jsfdrools.metadata.base.CalendarMeta;
import vn.nvanhuong.jsfdrools.metadata.base.InputMeta;

public class PersonMeta {
	private InputMeta firstName;
	private InputMeta lastName;
	private CalendarMeta birthdate;

	public InputMeta getFirstName() {
		return firstName;
	}

	public void setFirstName(InputMeta firstName) {
		this.firstName = firstName;
	}

	public InputMeta getLastName() {
		return lastName;
	}

	public void setLastName(InputMeta lastName) {
		this.lastName = lastName;
	}

	public CalendarMeta getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(CalendarMeta birthdate) {
		this.birthdate = birthdate;
	}

}
