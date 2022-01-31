package rh.tuto.start.hTuto;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(final String model) {
		this.model = model;
	}
}
