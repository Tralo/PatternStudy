package test1.pk_1.builder;

public class ChildSuperManBuilder extends Builder{

	@Override
	public SuperMan getSuperMan() {
		superMan.setBody("强壮的躯体");
		superMan.setSpecialTalent("刀枪不入");
		superMan.setSpecialSymbol("胸前带小S标记");
		return superMan;
	}

}
