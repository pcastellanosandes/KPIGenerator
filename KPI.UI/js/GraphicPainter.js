
function generateGraph(container, title){
	
	var projects = getDataByProject();
	
	
	
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


















