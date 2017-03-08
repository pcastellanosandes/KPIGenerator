function orderDates(a,b){
	if((a.Month < b.Month && a.Year == b.Year) || a.Year < b.Year)  return -1;
	if((a.Month > b.Month && a.Year == b.Year) || a.Year > b.Year) return 1;
	return 0;
}

function getDataByProject(){
	 var projectsData = [];
	 var projData;
	 var projects = convertToJSON();
	 
	 for(iProj=0; iProj < projects.length; iProj++)
	 {
	 	projData ={};
	 	projData.name = projects[iProj].name;
	 	projData.MaxDate = {};
	 	projData.MaxDate.Month = 01;
		projData.MaxDate.Year = 0001
		
	 	for(iPhase=0; iPhase < projects[iProj].phases.length; iPhase++)	
	 	{
	 		projData = getProjectData(projects[iProj].phases[iPhase].tasks, projData);
	 	}
	 	if(projData.MaxDate.Year>0001)
	 		findMonthData(projData, projData.MaxDate.Text); //para obligar la creación del mes limite en caso de faltar
	 		
	 	projData.Months.sort(orderDates);
	 	projectsData.push(projData);
	 } 
	 
	 return projectsData;
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
		possibleMaxDateLimit = convertDate(task.completedDate);
		projData.MaxDate = orderDates(projData.MaxDate, possibleMaxDateLimit) == -1 ? possibleMaxDateLimit :  projData.MaxDate;
		
		taskDataByMonth = findMonthData(projData, dateConverted.Text);
		taskDataByMonth.Month = dateConverted.Month;
		taskDataByMonth.Year = dateConverted.Year;
		
		if(!task.isReprocessedTask)
		{
			taskDataByMonth.Efficiency += task.timeEstimated === 0 ? 0 : task.timeLoggedMin/task.timeEstimated;
			taskDataByMonth.CountEfficiency++;
		}
		else
		{
			taskDataByMonth.ReprocessedEfficiency += task.timeEstimated === 0 ? 0 : task.timeLoggedMin/task.timeEstimated;
			taskDataByMonth.CountReprocessedEfficiency++;
		}
	} 	
	return projData;
 }
 
 function findMonthData(projData, monthToFind)
 {
 	var response, wasFound=false;
 	if(projData.Months === undefined)
 		projData.Months = [];
 		
 	for(j=0; j< projData.Months.length && !wasFound;j++){
 		if(projData.Months[j].DateText === monthToFind)
 		{
 			response = projData.Months[j];
 			wasFound = true;  
 		}
 	}
 	
 	if(!wasFound){
 		response = createMothData(monthToFind);
 		findMonth = false;
 		projData.Months.push(response);
 	}
 	
 	return response;
 }
 
 function createMothData(month){
 	var response = {};
 	response.DateText = month;
 	response.Efficiency = 0;
 	response.CountEfficiency = 0; 
 	response.ReprocessedEfficiency = 0;
 	response.CountReprocessedEfficiency = 0;
 	return response;
 }
 
 function convertDate(dateToConvert)
 {
 	var dateFinal = {};
 	var dateItems = dateToConvert.split(' ')[0].split('/');
 	if(dateItems.length == 3)
 	{
	 	dateFinal.Text = dateItems[1]+ '/' +dateItems[2];
	 	dateFinal.Month = dateItems[1];
	 	dateFinal.Year = dateItems[2];
 	}else
 	{	
 		dateFinal.Text = '01/0001'
	 	dateFinal.Month = 01;
	 	dateFinal.Year = 0001;
 	}
 	return dateFinal;
 }
 
 function convertToJSON(){
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

function generateGraph(){

Highcharts.chart('container', {
        title: {
            text: 'Monthly Average Temperature',
            x: -20 //center
        },
        subtitle: {
            text: 'Source: WorldClimate.com',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'Temperature (°C)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '°C'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Tokyo',
            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
        }, {
            name: 'New York',
            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
        }, {
            name: 'Berlin',
            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
        }, {
            name: 'London',
            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
        }]
    })




































}