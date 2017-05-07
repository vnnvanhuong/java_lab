	package vn.nvanhuong.system.separationconstructing.di;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule{

	@Override
	protected void configure() {
		bind(Service.class).to(CustomService.class);
	}

}
