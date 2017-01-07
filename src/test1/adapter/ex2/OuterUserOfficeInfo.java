package test1.adapter.ex2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap<>();
		officeInfoMap.put("jobPosition", "这个人的职位是BOSS...");
		officeInfoMap.put("officeTelNumber", "员工的办公电话是...");
		return officeInfoMap;
	}

}
