package command;

public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		pg.find();
		rg.delete();
		rg.plan();
		
	}
	
	

}
