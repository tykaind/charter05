package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(is, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		String str="";
		
		while(true) {
		str = br.readLine(); //라인이기때문에 한줄씩 읽어온다.
		if(str==null) {
			break;
		}
		System.out.println(str);
		}
		
		br.close();
	}

}
