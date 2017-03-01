package co.edu.uniandes.PreprocessKPIGenerator.logic;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import co.edu.uniandes.PreprocessKPIGenerator.Data.FileManager;
import co.edu.uniandes.PreprocessKPIGenerator.Models.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class GeneratorToJSON {

	private String csvPath;
	private String jsonPath;
	private List<Project> projects;
	
	public GeneratorToJSON(String csvPath, String jsonPath) {
		this.csvPath = csvPath;
		this.jsonPath = jsonPath;
		projects = new LinkedList<Project>();
	}
	
	public void Convert(){
		List<String> lines = FileManager.Read(csvPath);
		for (String line : lines) {
			CreateTask(line);
		}
		
		 Gson gson = new Gson();
         Type type = new TypeToken<List<Project>>() {}.getType();
         String json = gson.toJson(projects, type);
         FileManager.Save(json, jsonPath);
	}

	private void CreateTask(String line) {
		String[] itemsLine = line.split(";");
		String[] taskName = itemsLine[3].split("\\|");
		Project project = FindProject(itemsLine[1]);
		Phase phase = CreatePahase(project, taskName[1]);
		CreateTask(phase, itemsLine, taskName);
	}

	private void CreateTask(Phase phase, String[] itemsLine, String[] taskName) {
		
		Task task = new  Task();
		task.setId(Integer.parseInt(itemsLine[0]));
		task.setName(itemsLine[3]);
		task.setUseCase(taskName.length==5?taskName[3]:taskName[2]);
		task.setSequenceNumber(Double.parseDouble(taskName[taskName.length-1]));
		task.setDescription(itemsLine[4].length()==0?"-":itemsLine[4]);
		task.setStartDate(itemsLine[5]);
		task.setDueDate(itemsLine[6]);
		task.setPriority(itemsLine[7].length()==0?"-": itemsLine[7]);
		task.setPrivate(itemsLine[8].equals("VERDADERO"));
		task.setProgress(itemsLine[9].equals("")?0:Integer.parseInt(itemsLine[9]));
		task.setStatus(itemsLine[10]);
		task.setStatusText(itemsLine[11]);
		task.setAssignedTo(itemsLine[12]);
		task.setCreatedDate(itemsLine[13]);
		task.setCompletedDate(itemsLine[16].length()==0?"-": itemsLine[16]);
		task.setTimeLoggedMin(itemsLine[19].equals("")?0:Integer.parseInt(itemsLine[19]));
		task.setBillableTime(itemsLine[20].equals("")?0:Integer.parseInt(itemsLine[20]));
		task.setCompletedOnTime(itemsLine[22].equals("VERDADERO"));
		task.setTimeEstimated(itemsLine[22].equals("")?0:Integer.parseInt(itemsLine[23]));		
		//task.setTags(itemsLine[7].length()==0?" ":itemsLine[7]);
		phase.addTask(task);
	}

	private Project FindProject(String projectName) {
		Project project=null;
		for (Project proj: projects) {
			if(proj.getName().equals(projectName)){
				project = proj;
				break;
			}
		}
		
		if(project==null)
		{
			project = new Project(projectName);
			projects.add(project);
		}
		return project;
	}
	
	private Phase CreatePahase(Project project, String phaseName) {
		Phase phase=null;
		for (Phase p: project.getPhases()) {
			if(p.getName().equals(phaseName)){
				phase =p;
				break;
			}
		}
		
		if(phase==null){
			phase= new Phase(phaseName);
			project.addPhase(phase);
		}
		
		return phase;
	}
}
