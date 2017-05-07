package vn.nvanhuong.system.separationconstructing.factory;

public class Controller {
	private Service service;
	
	public Controller(Service service){
		this.service = service;
	}
	
	public void doAction(){
		System.out.println("doAction in Controller");
		service.execute();
	}
}
