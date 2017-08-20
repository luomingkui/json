package com.guigu.json;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectSample {

	public static void main(String[] args) {
		newJSONObject();
		createJsonByMap();
		createJsonByBean();
	}

	// 1.使用JsonObject实现Json
	private static void newJSONObject() {
		JSONObject terence = new JSONObject();
		Object nullObj = null;
		try {
			terence.put("name", "simeng");
			terence.put("age", 25);
			terence.put("birthday", "1992-11-09");
			terence.put("school", "qushi");
			terence.put("major", new String[] { "程序员", "教师" });
			terence.put("has_girlfriend", false);
			terence.put("car", nullObj);
			terence.put("house", nullObj);
			terence.put("comment", "注释");
			System.out.println(terence.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// 2.使用Map实现Json
	private static void createJsonByMap() {
		Map<String, Object> terence = new HashMap<String, Object>();
		Object nullObj = null;
		terence.put("name", "simeng");
		terence.put("age", 25);
		terence.put("birthday", "1992-11-09");
		terence.put("school", "qushi");
		terence.put("major", new String[] { "程序员", "教师" });
		terence.put("has_girlfriend", false);
		terence.put("car", nullObj);
		terence.put("house", nullObj);
		terence.put("comment", "注释");
	}

	// 3.使用Bean实现Json
	private static void createJsonByBean() {
		DaShen terence = new DaShen();
		terence.setName("simeng");
		terence.setAge(25);
		terence.setBirthday("1990-5-9");
		terence.setSchool("qushi");
		terence.setMajor(new String[] { "程序员", "教师" });
		terence.setHas_girlfriend(false);
		terence.setComment("注释");
		terence.setCar(null);
		terence.setHouse(null);
		System.out.println(new JSONObject(terence));
	}
}
