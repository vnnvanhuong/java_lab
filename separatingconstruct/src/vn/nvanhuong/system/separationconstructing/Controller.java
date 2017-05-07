package vn.nvanhuong.system.separationconstructing;

public class Controller {
	private Service service;
	
	public void doAction(){
		System.out.println("doAction in Controller");
		getService().execute();
	}
	
	public Service getService(){
		if(service == null){
			service = new DefaultService();
		}
		return service;
	}
}
