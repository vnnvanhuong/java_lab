package vn.nvanhuong.jsfdrools.metadata;

import vn.nvanhuong.jsfdrools.metadata.base.InputMeta;

public class AddressMeta {
	private InputMeta houseNumber;
	private InputMeta street;

	public InputMeta getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(InputMeta houseNumber) {
		this.houseNumber = houseNumber;
	}

	public InputMeta getStreet() {
		return street;
	}

	public void setStreet(InputMeta street) {
		this.street = street;
	}

}
