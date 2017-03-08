function orderDates(a,b){
	if((a.Month < b.Month && a.Year == b.Year) || a.Year < b.Year)  return -1;
	if((a.Month > b.Month && a.Year == b.Year) || a.Year > b.Year) return 1;
	return 0;
}

 function convertDate(dateToConvert)
 {
 	var dateFinal = {};
 	var dateItems = dateToConvert.split(' ')[0].split('/');
 	if(dateItems.length == 3)
 	{
	 	dateFinal.Text = dateItems[1]+ '/' +dateItems[2];
	 	dateFinal.Month = parseInt(dateItems[1]);
	 	dateFinal.Year = parseInt(dateItems[2]);
 	}else
 	{	
 		dateFinal.Text = '01/0001'
	 	dateFinal.Month = 01;
	 	dateFinal.Year = 0001;
 	}
 	return dateFinal;
 }