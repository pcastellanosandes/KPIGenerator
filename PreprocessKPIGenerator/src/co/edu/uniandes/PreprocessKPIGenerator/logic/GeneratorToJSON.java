package co.edu.uniandes.PreprocessKPIGenerator.logic;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import co.edu.uniandes.PreprocessKPIGenerator.Data.FileManager;
import co.edu.uniandes.PreprocessKPIGenerator.Models.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class GeneratorToJSON {

	private String csvPath;
	private String jsonPath;
	private List<Project> projects;
	final static String DOUBLE_PATTERN = "\\d+\\.\\d+";
	
	public GeneratorToJSON(String csvPath, String jsonPath) {
		this.csvPath = csvPath;
		this.jsonPath = jsonPath;
		projects = new LinkedList<Project>();
	}
	
	public void convert(){
		List<String> lines = FileManager.Read(csvPath);
		for (String line : lines) {
			createTask(line);
		}
		associateReproccessedTask();
		 Gson gson = new Gson();
         Type type = new TypeToken<List<Project>>() {}.getType();
         String json = gson.toJson(projects, type);
         FileManager.Save(json, jsonPath);
	}

	private void associateReproccessedTask() {
		for(Project project : projects){
			for(Phase phase : project.getPhases()){
				for(Task task : phase.getTasks()){
					if(task.isReprocessedTask()){
						task.setIdParentTask(findParentTask(task.getName(), task.getId()));
					}
				}
			}
		}
	}

	private void createTask(String line) {
		String[] itemsLine = line.split(";");
		String[] taskName = itemsLine[3].split("\\|");
		Project project = findProject(itemsLine[1]);
		Phase phase = createPahase(project, taskName[1]);
		createTask(phase, itemsLine, taskName);
	}

	private void createTask(Phase phase, String[] itemsLine, String[] taskName) {
		
		Task task = new  Task();
		task.setId(Integer.parseInt(itemsLine[0]));
		task.setName(itemsLine[3]);
		task.setUseCase(taskName.length==5?taskName[3]:taskName[2]);
		task.setSequenceNumber(Double.parseDouble(taskName[taskName.length-1]));
		task.setReprocessedTask(isReprocessedTask(taskName[taskName.length-1]));
		task.setStartDate(itemsLine[5].length()==0?"-": itemsLine[5]);
		task.setDueDate(itemsLine[6].length()==0?"-": itemsLine[6]);
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
		
		phase.addTask(task);
	}

	private boolean isReprocessedTask(String number) {
		number= number.trim();
		return Pattern.matches(DOUBLE_PATTERN, number);
	}

	private Project findProject(String projectName) {
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
	
	private Phase createPahase(Project project, String phaseName) {
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

	private int findParentTask(String completedName, int currentId){
		String nameTaskToFind = completedName.substring(0, completedName.lastIndexOf('|'));
		for(Project project : projects){
			for(Phase phase : project.getPhases()){
				for(Task task : phase.getTasks()){
					if(task.getName().startsWith(nameTaskToFind) && task.getId() != currentId) {
						return task.getId();
					}
				}
			}
		}
		return 0;
	}


}
