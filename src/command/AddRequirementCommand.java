package command;

public class AddRequirementCommand extends Command{

	@Override
	public void execute() {
		rg.find();
		
		rg.add();
		
		rg.plan();
		
	}

}
