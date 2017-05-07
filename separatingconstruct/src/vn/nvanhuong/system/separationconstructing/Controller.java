package vn.nvanhuong.system.separationconstructing;

public class Controller {
	private Service service;
	
	public Controller(){
		if(service == null){
			service = new DefaultService();
		}
	}
	
	public void doAction(){
		System.out.println("doAction in Controller");
		service.execute();
	}
}
