package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("1.락교종이 됑됑됑");
		bw.newLine();
		bw.write("2.락교종이 됑됑됑");
		bw.newLine();
		bw.write("3.락교종이 됑됑됑");
		bw.newLine();
		
		
		
		
		
		
		
		
		bw.close();
		
		/*
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		String str = "학교종이 떙떙땡 어서 모이자 선생님이 우리를 기다리신다.";
		fw.write(str);
		fw.close();
		*/
	}

}
