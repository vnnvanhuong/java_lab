package vn.nvanhuong.system.separationconstructing.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

/*
 * http://www.journaldev.com/2403/google-guice-dependency-injection-example-tutorial
 */
public class App {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());		
		Controller controller = injector.getInstance(Controller.class);
		controller.doAction();
	}
}
