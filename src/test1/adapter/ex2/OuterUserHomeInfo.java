package test1.adapter.ex2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap<>();
		homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
		homeInfoMap.put("homeAddress", "员工的家庭地址是...");
		return homeInfoMap;
	}

}
