package test1.command;

public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		super.pg.find();
		super.rg.delete();
		super.rg.delete();
	}

}
