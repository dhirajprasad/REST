package com.dp.codelab.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

	public void read(String file) {
		System.out.println("hello");
		BufferedReader br = null;
		FileReader fr = null;

		try {

			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}

	public void write(String filename,String content) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			File file = new File(filename);
			file.createNewFile(); 
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
}
