
function generateGraph(){
	var projectInfo;
	var projects = getAllDataByProjects();
	var idGraph;
	for(iProj =0; iProj<projects.length; iProj++)
	{
		idGraph = iProj+1;
		processProject(projects[iProj], 'EffectivenessGraph'+idGraph, 'ReprocessedEfficiencyGraph'+idGraph);	
	}
}

function generateByProject(project){
	var projectInfo;
	var projData = getDataByProject(project);
	processProject(projData, 'EffectivenessGraph', 'ReprocessedEfficiencyGraph');	
	
}

function processProject(project, graphTask, graphReprocessedTask)
{
	var name = project.name;
	projectInfo = getGraphData(project.MonthsTask,name);
	var y = [];
	y.push(projectInfo.yAxis);
	paintGraph(graphTask, 'Grafica de eficacia', projectInfo.xAxis, y);
	
	if(project.MonthsReprocessedTask !== undefined)
	{
		projectInfo = getGraphData(project.MonthsReprocessedTask,name);
		y = [];
		y.push(projectInfo.yAxis);
		paintGraph(graphReprocessedTask, 'Grafica de reprocesos internos', projectInfo.xAxis, y);
	}else
	{
		$("#"+graphReprocessedTask).hide();
	}
}

function getGraphData(months, projName)
{
	var data={};
	data.xAxis=[];
	data.yAxis={};
	var date = {};
	data.yAxis.data = [];
	var month, year, size=months.length;
	
	data.yAxis.name = projName;
	for(posM=0; posM< size; posM++)
	{
		date.Month = months[posM].Month; 
		date.Year = months[posM].Year;	
		data.xAxis.push(months[posM].DateText);
		data.yAxis.data.push(months[posM].CountEffectiveness === 0 ? 0 : months[posM].Effectiveness/months[posM].CountEffectiveness);
		date = addMonth(date);
		while((posM+1)<size && date.Month!=months[posM+1].Month && date.Year!=months[posM+1].Year)
		{
			data.xAxis.push(date.Month + '/' +date.Year);
			data.yAxis.data.push(0);
			date = addMonth(date);
		}
	}
	return data;
}

function addMonth(date)
{
	if(date.Month === 12)
	{
		date.Month = 01;
		date.Year++;
	}else
		date.Month++;
	
	return date;
}

function paintGraph(container, title, months, projects){
	Highcharts.chart(container, {
        title: {
            text: title,
            x: -20 //center
        },
        xAxis: {
            categories: months
        },
        yAxis: {
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: projects
    });
}


















