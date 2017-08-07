package vn.nvanhuong.jsfdrools.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.drools.compiler.DroolsParserException;

import vn.nvanhuong.jsfdrools.domain.Address;
import vn.nvanhuong.jsfdrools.domain.Dossier;
import vn.nvanhuong.jsfdrools.domain.Person;
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

	public void onStart() throws DroolsParserException, IOException {
		//initialized
		metadata = new DossierMeta();
		metadata.setAddress(new AddressMeta());
		metadata.getAddress().setHouseNumber(new InputMeta());
		metadata.getAddress().setStreet(new InputMeta());
		metadata.setPerson(new PersonMeta());
		metadata.getPerson().setBirthdate(new CalendarMeta());
		metadata.getPerson().setFirstName(new InputMeta());
		metadata.getPerson().setLastName(new InputMeta());
		
		//initialized
		datamodel = new Dossier();
		datamodel.setAddress(new Address());
		datamodel.setPerson(new Person());
		
		//load rules
		List<Object> objects = new ArrayList<Object>();
		objects.add(metadata.getAddress());
		objects.add(metadata.getPerson());
		objects.add(datamodel.getAddress());
		objects.add(datamodel.getPerson());
		
		RuleExecutor re = new RuleExecutor();
		re.execute(objects);
	}
	
	public void onSubmit() {
		System.out.println("====onSubmit called");
	}
	
	public void onValueChange() throws DroolsParserException, IOException {
		List<Object> objects = new ArrayList<Object>();
		objects.add(metadata.getAddress());
		objects.add(metadata.getPerson());
		objects.add(datamodel.getAddress());
		objects.add(datamodel.getPerson());
		
		RuleExecutor re = new RuleExecutor();
		re.execute(objects);
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
