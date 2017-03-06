package co.edu.uniandes.PreprocessKPIGenerator.UI;

import java.nio.file.Path;
import java.nio.file.Paths;

import co.edu.uniandes.PreprocessKPIGenerator.logic.*;

public class Main {
	public static void main(String[] args) {
          
		Path path = Paths.get("");
		String absolutePath = path.toAbsolutePath().toString();
		 
		String pathCSV = absolutePath+"\\input.csv";
		
		String pathJSON = absolutePath+"\\output.json";
		GeneratorToJSON generator = new GeneratorToJSON(pathCSV, pathJSON);
		generator.convert();
		
		System.out.println("fin del preprocesamiento");
		
	}

}
