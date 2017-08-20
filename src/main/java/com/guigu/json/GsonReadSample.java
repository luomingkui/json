package com.guigu.json;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonReadSample {
	public static void main(String[] args) throws Exception {
		/*
		 * 1.利用GSON逆向解析生成Bean
		 * File file = new File(ReadJsonSample.class.getResource("/terence.json").getFile());
		String content = FileUtils.readFileToString(file);
		Gson gson = new Gson();
		DaShen terence = gson.fromJson(content, DaShen.class);
		System.out.println(terence.toString());*/
		
		/*//2.设置日期格式
		 File file = new File(ReadJsonSample.class.getResource("/terence.json").getFile());
		String content = FileUtils.readFileToString(file);
		Gson g=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();       
		DaShenGson terence = g.fromJson(content,DaShenGson.class);
		System.out.println(terence.getBirthday());*/
		
		//不管是List还是Set，都会自动转化，不需要做额外的辅助，直接输出就可以看到了
		File file = new File(ReadJsonSample.class.getResource("/terence.json").getFile());
		String content = FileUtils.readFileToString(file);
		Gson g=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();       
		DaShenGson terence = g.fromJson(content,DaShenGson.class);
		System.out.println(terence.getClass());
		System.out.println(terence.getMajor());
		System.out.println(terence.getMajor().getClass());
		
		
	}
}
