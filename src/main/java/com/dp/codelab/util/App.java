package com.dp.codelab.util;

import java.io.File;

public class App {

	public static void main(String[] args) {
		String s= "D:\\VerifoneSoftware\\apache-tomcat-8.0.33\\webapps\\IDSTest\\";
		File dir = new File(s+"\temp"); 
	       boolean exists = dir.exists();
	       System.out.println(exists);

	}

}
