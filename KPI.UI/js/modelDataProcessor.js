function getAllDataByProjects()
{
	 var projectsData = [];
	 var projData;
	 var projects = convertToJSON();
	 
	 for(iProj=0; iProj < projects.length; iProj++)
	 {
	 	projData ={};
	 	projData.name = projects[iProj].name;
	 	projData.TaskMaxDate = {};
	 	projData.TaskMaxDate.Month = 01;
		projData.TaskMaxDate.Year = 0001
		
		projData.ReprocessedTaskMaxDate = {};
	 	projData.ReprocessedTaskMaxDate.Month = 01;
		projData.ReprocessedTaskMaxDate.Year = 0001
		
	 	for(iPhase=0; iPhase < projects[iProj].phases.length; iPhase++)	
	 	{
	 		projData = getProjectData(projects[iProj].phases[iPhase].tasks, projData);
	 	}
	 	if(projData.TaskMaxDate.Year>0001)
	 		findMonthData(projData, projData.TaskMaxDate.Text, false); //para obligar la creación del mes limite en caso de faltar
 		if(projData.ReprocessedTaskMaxDate.Year>0001)
	 		findMonthData(projData, projData.ReprocessedTaskMaxDate.Text, true); //para obligar la creación del mes limite en caso de faltar
	 		
	 	if(projData.MonthsTask !== undefined)	
	 		projData.MonthsTask.sort(orderDates);
 		if(projData.MonthsReprocessedTask !== undefined)
	 		projData.MonthsReprocessedTask.sort(orderDates);
	 	projectsData.push(projData);
	 } 
	 
	 return projectsData;
}

function getDataByProject(project)
{
	 var projectsData = [];
	 var projData;	 
	
	 projData ={};
	 projData.name = project.name;
	 projData.TaskMaxDate = {};
	 projData.TaskMaxDate.Month = 01;
	 projData.TaskMaxDate.Year = 0001
		
	 projData.ReprocessedTaskMaxDate = {};
	 projData.ReprocessedTaskMaxDate.Month = 01;
	 projData.ReprocessedTaskMaxDate.Year = 0001
		
	 for(iPhase=0; iPhase < project.phases.length; iPhase++)	
	 {
	 	projData = getProjectData(project.phases[iPhase].tasks, projData);
	 }
	 
	 if(projData.TaskMaxDate.Year>0001)
	 	findMonthData(projData, projData.TaskMaxDate.Text, false); //para obligar la creación del mes limite en caso de faltar
 	 if(projData.ReprocessedTaskMaxDate.Year>0001)
	 	findMonthData(projData, projData.ReprocessedTaskMaxDate.Text, true); //para obligar la creación del mes limite en caso de faltar
	 		
	 if(projData.MonthsTask !== undefined)	
	 	projData.MonthsTask.sort(orderDates);
 	 if(projData.MonthsReprocessedTask !== undefined)
	 	projData.MonthsReprocessedTask.sort(orderDates);
	 
	 return projData;
}

function getProjectData(tasks, projData)
{
	var taskDataByMonth;
	var task;
	var dateConverted;
	var possibleMaxDateLimit;
	
	for(i=0; i < tasks.length; i++)
	{
		task = tasks[i];
		dateConverted = convertDate(task.createdDate);
		validateMaxDate(projData,task.completedDate,task.isReprocessedTask);
		taskDataByMonth = findMonthData(projData, dateConverted.Text, task.isReprocessedTask);
		taskDataByMonth.Month = dateConverted.Month;
		taskDataByMonth.Year = dateConverted.Year;
		taskDataByMonth.Effectiveness += task.timeEstimated === 0 ? 0 : task.timeLoggedMin/task.timeEstimated;
		taskDataByMonth.CountEffectiveness++;
	} 	
	
	return projData;
}
 
function validateMaxDate(projData, possibleMaxDate, isReprocessedTask)
{
 		var possibleMaxDateLimit = convertDate(possibleMaxDate);
 		if(!isReprocessedTask)
			projData.TaskMaxDate = orderDates(projData.TaskMaxDate, possibleMaxDateLimit) == -1 ? possibleMaxDateLimit :  projData.TaskMaxDate;
		else
			projData.ReprocessedTaskMaxDate = orderDates(projData.ReprocessedTaskMaxDate, possibleMaxDateLimit) == -1 ? possibleMaxDateLimit :  projData.ReprocessedTaskMaxDate;
 }
 
 function findMonthData(projData, monthToFind, isReprocessedTask)
 {
 	if(!isReprocessedTask)
 		return FindMonthToTask(projData, monthToFind);
 	else
 		return FindMonthToReprocessedTask(projData, monthToFind);	
}

function FindMonthToTask(projData, monthToFind)
{
 	if(projData.MonthsTask === undefined)
 		projData.MonthsTask = [];
 	
 	var task = 	FindMonth(projData.MonthsTask, monthToFind);
 	
 	if(task === undefined){
 		task = createMothData(monthToFind);
 		projData.MonthsTask.push(task);
 	}
 	return task;
}
 
function FindMonthToReprocessedTask(projData, monthToFind)
{
 	if(projData.MonthsReprocessedTask === undefined)
 		projData.MonthsReprocessedTask = [];
 	
 	var task = 	FindMonth(projData.MonthsReprocessedTask, monthToFind);
 	
 	if(task === undefined){
 		task = createMothData(monthToFind);
 		projData.MonthsReprocessedTask.push(task);
 	}
 	return task;
 }
 
function FindMonth(listMonth, monthToFind)
 {
 	var response;
 	for(j=0; j< listMonth.length; j++)
 	{
 		if(listMonth[j].DateText === monthToFind)
 		{
 			response = listMonth[j];
 			break;
 		}
 	}
 	return response;
 }
 
function createMothData(month)
{
 	var response = {};
 	response.DateText = month;
 	response.Effectiveness = 0;
 	response.CountEffectiveness = 0; 
 	return response;
 }
  
function convertToJSON()
{
	 var posPhase=0;
	 var projects = [];
	 var project;   
	 var task;
	 var phase;
 		project={};
	 	project.name = "COLMEDICA - Cuentas Médicas"
	 	posPhase = 0;
	 		project.phases = [];
	 		phase = {}
	 		phase.name = " AN "
	 		phase.tasks = [];
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-018. Devoluciones Internas - Especificación | 1";
	 			task.createdDate = "24/05/2016 11:22 PM";
	 			task.completedDate = "10/06/2016 10:42 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 240;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-019 Validación de Errores - Especificación | 1";
	 			task.createdDate = "24/05/2016 11:22 PM";
	 			task.completedDate = "01/07/2016 4:43 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 240;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | CUCLM-043. Administrar datos de prestadores - Especificación | 1";
	 			task.createdDate = "24/05/2016 11:22 PM";
	 			task.completedDate = "07/06/2016 8:50 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 540;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-001. Generar rótulos - Análisis | 1";
	 			task.createdDate = "28/07/2016 7:01 PM";
	 			task.completedDate = "01/08/2016 10:32 PM";
	 			task.timeLoggedMin = 470;
	 			task.timeEstimated = 120;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-013. Flujos auditoría - Análisis | 1";
	 			task.createdDate = "28/07/2016 10:12 PM";
	 			task.completedDate = "01/08/2016 10:20 PM";
	 			task.timeLoggedMin = 30;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-015. Consulta de documentos para revisión - Análisis | 1";
	 			task.createdDate = "28/07/2016 10:15 PM";
	 			task.completedDate = "01/08/2016 10:33 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-016. Revisión documentos UMD - Análisis | 1";
	 			task.createdDate = "28/07/2016 10:15 PM";
	 			task.completedDate = "01/08/2016 10:19 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-016. Revisión documentos UMD - Análisis | 1.1";
	 			task.createdDate = "28/07/2016 10:15 PM";
	 			task.completedDate = "01/08/2016 10:19 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = true;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-016. Revisión documentos UMD - Análisis | 1.2";
	 			task.createdDate = "28/07/2016 10:15 PM";
	 			task.completedDate = "01/08/2016 10:19 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = true;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-016. Revisión documentos UMD - Análisis | 1.3";
	 			task.createdDate = "28/07/2016 10:15 PM";
	 			task.completedDate = "01/08/2016 10:19 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = true;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-036. Asignación reprocesos (LW) - Análisis | 1";
	 			task.createdDate = "28/07/2016 10:17 PM";
	 			task.completedDate = "01/08/2016 10:34 PM";
	 			task.timeLoggedMin = 120;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-031. Exportación PILA - Análisis | 1";
	 			task.createdDate = "29/07/2016 10:59 PM";
	 			task.completedDate = "01/08/2016 10:35 PM";
	 			task.timeLoggedMin = 270;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-026. Cargue de Autorizaciones - Análisis | 1";
	 			task.createdDate = "08/08/2016 3:07 PM";
	 			task.completedDate = "11/08/2016 10:18 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-026. Cargue de Autorizaciones - Análisis | 1.1";
	 			task.createdDate = "08/08/2016 3:07 PM";
	 			task.completedDate = "11/08/2016 10:18 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = true;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | GC | CUCLM-026. Cargue de Autorizaciones - Análisis | 1.2";
	 			task.createdDate = "08/08/2016 3:07 PM";
	 			task.completedDate = "11/08/2016 10:18 PM";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = true;
	 			phase.tasks.push(task);
	
	 		project.phases.push(phase);
	 		posPhase++;
	 	projects.push(project);
 		project={};
	 	project.name = "ICFES"
	 	posPhase = 0;
	 		project.phases = [];
	 		phase = {}
	 		phase.name = " AN "
	 		phase.tasks = [];
	 			task = {};
	 			task.name = "| AN | CULWB-044. Plantilla de Exportación de Imágenes - Análisis | 1";
	 			task.createdDate = "06/09/2016 9:27 PM";
	 			task.completedDate = "06/09/2016 9:32 PM";
	 			task.timeLoggedMin = 450;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	 			task = {};
	 			task.name = "| AN | CULYE-089. Exportación de Imágenes - Análisis | 1";
	 			task.createdDate = "06/09/2016 9:29 PM";
	 			task.completedDate = "06/09/2016 9:32 PM";
	 			task.timeLoggedMin = 420;
	 			task.timeEstimated = 0;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	
	 		project.phases.push(phase);
	 		posPhase++;
	 	projects.push(project);
 		project={};
	 	project.name = "PORVENIR"
	 	posPhase = 0;
	 		project.phases = [];
	 		phase = {}
	 		phase.name = " AN "
	 		phase.tasks = [];
	 			task = {};
	 			task.name = "| AN | CUPR-017 Exportación Solicitud de traslado de Salidas  - Análisis | 1";
	 			task.createdDate = "20/01/2017 10:14 PM";
	 			task.completedDate = "-";
	 			task.timeLoggedMin = 0;
	 			task.timeEstimated = 540;
	 			task.isReprocessedTask = false;
	 			phase.tasks.push(task);
	
	 		project.phases.push(phase);
	 		posPhase++;
	 	projects.push(project);
	 
	 return projects;
}
