package com.cg.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLamda {

	public static void main(String[] args) 
	{
		//lambda expression for searching the file in given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith("pptx");
		File dir=new File("C:\\Users\\hp\\Desktop");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		//if any particular extension file is open then you will get that file in two times
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
