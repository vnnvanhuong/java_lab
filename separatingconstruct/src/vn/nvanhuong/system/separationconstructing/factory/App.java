package vn.nvanhuong.system.separationconstructing.factory;


/**
 * https://en.wikipedia.org/wiki/Abstract_factory_pattern
 */
public class App {
	public static void main(String[] args) {
		ServiceFactory factory = new ServiceFactory();
		Service service = factory.getService(null);
		Controller controller = new Controller(service);
		controller.doAction();
	}
}
