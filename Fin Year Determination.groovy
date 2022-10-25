
	//Create year and month wise folder structure based on the current date
    String year = new Date().format('YY');
    String month = "";
    String mon = new Date().format('MM');
    int mm = mon.toInteger();
    if (mon == "01"){
        month = "06. December";
    } else if (mon == "02"){
        month = "07. January";
    } else if (mon == "03"){
        month = "08. February"; 
    } else if (mon == "04"){
        month = "09. March";
    } else if (mon == "05"){
        month = "10. April";
    } else if (mon == "06"){
        month = "11. May";
    } else if (mon == "07"){
        month = "12. June";
    } else if (mon == "08"){
        month = "01. July";
    } else if (mon == "09"){
        month = "02. August";
    } else if (mon == "10"){
        month = "03. September";
    } else if (mon == "11"){
        month = "04. October";
    } else {
        month = "05. November";
    }; 
    
    if (mm > 8){
        financialYear = year.toInteger()+1;
    } else {
        financialYear = year.toInteger();
    }

