package test1.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "这个员工叫混世魔王...");
		baseInfoMap.put("mobileNumber", "这个员工电话是...");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumber", "员工的家庭地址是...");
		homeInfo.put("homeAddress", "员工的家庭地址是...");
		return homeInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap officeInfo = new HashMap<>();
		officeInfo.put("jobPosition", "这个人的职位是Boss...");
		officeInfo.put("officeTelNumber", "员工的办公电话是...");
		return officeInfo;
	}

}
