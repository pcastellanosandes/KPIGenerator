package co.edu.uniandes.PreprocessKPIGenerator.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileManager {

	public static List<String> Read(String path){
		List<String> lines = new LinkedList<String>();
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(path);
			bufferedReader = new BufferedReader(fileReader);

			String currentLine;

			bufferedReader.readLine(); //descarta la primera linea
			while ((currentLine = bufferedReader.readLine()) != null) {
				lines.add(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				if (fileReader != null)
					fileReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return lines;
	}
	
	public static void Save(String json, String path) {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(path);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null)
					bufferedWriter.close();

				if (fileWriter != null)
					fileWriter.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}



