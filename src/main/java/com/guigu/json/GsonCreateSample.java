package com.guigu.json;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonCreateSample {
	public static void main(String[] args) {
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
		
		//Gson gson = new Gson();
		//System.out.println(gson.toJson(terence));
		
		GsonBuilder gsonBuilder=new GsonBuilder();  
		gsonBuilder.setPrettyPrinting();//设置出漂亮的格式  
		Gson gson2=gsonBuilder.create();  
		System.out.println(gson2.toJson(terence));
		
	}		
}
