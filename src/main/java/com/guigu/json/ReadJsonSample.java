package com.guigu.json;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class ReadJsonSample {
	// 反向解析为一个json
	public static void main(String[] args) throws Exception {
		File file = new File(ReadJsonSample.class.getResource("/terence.json").getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObject = new JSONObject(content);
		if (!jsonObject.isNull("name")) {
			System.out.println("姓名：" + jsonObject.getString("name"));
		}
		System.out.println("年龄：" + jsonObject.getDouble("age"));
	}

}
