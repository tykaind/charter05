package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		String str="";
		String name;
		String hp;
		String company;
		
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
		str = br.readLine();
		
		if(str==null) {
			break;
		}
		
		String[] all = new String[3];
		all = str.split(",");
		name = String.valueOf(all[0]);
		hp = String.valueOf(all[1]);
		company = String.valueOf(all[2]);
		
		Person p = new Person(name,hp,company);
		
		pList.add(p);

		}
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름:"+pList.get(i).getName());
			System.out.println("폰번:"+pList.get(i).getHp());
			System.out.println("회사:"+pList.get(i).getCompany());
			System.out.println("");
		}
		br.close();
	}
}
