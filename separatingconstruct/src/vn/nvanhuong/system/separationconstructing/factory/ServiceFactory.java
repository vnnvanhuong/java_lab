package vn.nvanhuong.system.separationconstructing.factory;

import java.util.Objects;

public class ServiceFactory {

	public Service getService(ServiceName serviceName) {
		if(Objects.isNull(serviceName)){
			throw new IllegalArgumentException("service name must not be null");
		}
		
		switch (serviceName) {
		case DEFAULT:
			return new DefaultService();
		case CUSTOM:
			return new CustomService();
		default:
			return null;
		}
	}

}
