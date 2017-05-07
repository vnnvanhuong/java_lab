package vn.nvanhuong.system.separationconstructing.main;

public class App {
	public static void main(String[] args) {
		Service service = new DefaultService();
		Controller controller = new Controller(service);
		controller.doAction();
	}
}
