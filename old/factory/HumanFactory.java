package factory;

public class HumanFactory {
	
	public static Human createHuman(Class c){
		
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("必须指定人类的颜色");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("人类定义错误!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("混蛋,你指定的人类找不到!");
			e.printStackTrace();
		}
		
		return human;
		
	}

}
