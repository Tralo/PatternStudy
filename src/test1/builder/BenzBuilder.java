package test1.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
