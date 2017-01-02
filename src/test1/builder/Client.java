package test1.builder;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		/*BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		benz.setSequence(sequence);
		
		benz.run();*/
		
		//构造者模式
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
		benzModel.run();
		
		
		
	}
}
