package test1.pk_1.builder;

public class AdultSuperManBuilder extends Builder{

	@Override
	public SuperMan getSuperMan() {
		superMan.setBody("强壮的躯体");
		superMan.setSpecialTalent("会飞行");
		superMan.setSpecialSymbol("胸前带S标记");
		return superMan;
	}
	

}
