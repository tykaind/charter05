package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		//Reader fr = new FileReader("C:\\javaStudy\\file\\MS949.txt");
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		String str = br.readLine(); //라인이기때문에 한줄씩 읽어온다.
		if(str==null) {
			break;
		}
		System.out.println(str);
		}
		
		
		br.close();
	}

}
