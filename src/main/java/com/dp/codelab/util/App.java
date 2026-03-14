package com.dp.codelab.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		String s= "D:\\VerifoneSoftware\\apache-tomcat-8.0.33\\webapps\\IDSTest\\";
		class Student{
			private int roll;
			private String namex;
			Set<Integer> mob;
			public Student(int roll, String name) {
				super();
				this.roll = roll;
				this.name = name;
			}
			public Set<Integer> getMob() {
				return mob;
			}
			public void setMob(Set<Integer> mob) {
				this.mob = mob;
			}
			
		}
		  File dir = new File(s+"\temp"); 
	       boolean exists = dir.exists();
	       System.out.println(exists);
	       List<Integer> l = Arrays.asList(1212,23,224,12);
	       List<String> list = Arrays.asList("Adhiraj","sdfsw","sdfw");
	       Map map = list.stream()
	    		   .collect(Collectors.toMap(p->p, p->p.length()));
	       System.out.println(map);
	       List ll= l.stream().filter(item->{
	    	   char i =item.toString().toCharArray()[0];
	    	   System.out.println(i+"*");
	    	   if(i=='1'){
	    		   return true;
	    	   }else{
	    		   return false;
	    	   }
	       }).collect(Collectors.toList());
	       
	       System.out.println(ll);
	       Map<String, String> map1 = new HashMap<String, String>();
	      
	       map1.put("india","sdf");
	       map1.put("pak","sdfsfs");
	       System.out.println(map1);
	       map1.entrySet().stream()
	       ;
	       List<Integer> ls = new ArrayList<>();
	       System.out.println(ls.size());
	       ls.add(3);
	       System.out.println(ls.size());
	       
	}

}
