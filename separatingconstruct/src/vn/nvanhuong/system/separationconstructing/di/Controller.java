package vn.nvanhuong.system.separationconstructing.di;

import com.google.inject.Inject;

public class Controller {
	private Service service;
	
	public void doAction(){
		System.out.println("doAction in Controller");
		service.execute();
	}
	
	@Inject
	public void setService(Service service){
		this.service = service;
	}
}
