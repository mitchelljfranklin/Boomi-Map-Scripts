
import java.text.SimpleDateFormat;  
import java.util.Date;  

if(inputDate){
  
Date formatedDate1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(inputDate);  
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 
String strDate= formatter.format(formatedDate1);  
formatedDate = strDate;

}