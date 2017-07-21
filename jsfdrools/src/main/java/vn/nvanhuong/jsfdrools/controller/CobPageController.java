package vn.nvanhuong.jsfdrools.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import vn.nvanhuong.jsfdrools.domain.Dossier;
import vn.nvanhuong.jsfdrools.metadata.AddressMeta;
import vn.nvanhuong.jsfdrools.metadata.DossierMeta;
import vn.nvanhuong.jsfdrools.metadata.PersonMeta;
import vn.nvanhuong.jsfdrools.metadata.base.CalendarMeta;
import vn.nvanhuong.jsfdrools.metadata.base.InputMeta;

@ManagedBean(name = "cobPage")
@ViewScoped
public class CobPageController {
	private Dossier datamodel;
	private DossierMeta metadata;

	public void onStart() {
		//initialized
		metadata = new DossierMeta();
		metadata.setAddress(new AddressMeta());
		metadata.getAddress().setHouseNumber(new InputMeta());
		metadata.getAddress().setStreet(new InputMeta());
		metadata.setPerson(new PersonMeta());
		metadata.getPerson().setBirthdate(new CalendarMeta());
		metadata.getPerson().setFirstName(new InputMeta());
		metadata.getPerson().setLastName(new InputMeta());
		
		//load rules
		metadata.getAddress().getHouseNumber().setMaxlength(5);
		metadata.getAddress().getStreet().setMaxlength(30);
		metadata.getAddress().getHouseNumber().setRequired(true);
		metadata.getAddress().getStreet().setRequired(true);
		
		metadata.getPerson().getFirstName().setMaxlength(30);
		metadata.getPerson().getLastName().setMaxlength(30);
	}
	
	public void onSubmit() {
		System.out.println("====onSubmit called");
	}

	public Dossier getDatamodel() {
		return datamodel;
	}

	public void setDatamodel(Dossier datamodel) {
		this.datamodel = datamodel;
	}

	public DossierMeta getMetadata() {
		return metadata;
	}

	public void setMetadata(DossierMeta metadata) {
		this.metadata = metadata;
	}

}
