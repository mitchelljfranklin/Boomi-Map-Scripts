
import java.util.Properties; 
import java.io.InputStream; 
import com.boomi.execution.ExecutionUtil; 
import java.util.Calendar; 
import java.text.SimpleDateFormat;

// Retrieve Dynamic Process Property value 
String lsrun = '20001231 ' + timein
int hourValue = addHours

// Parse date and add time
SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
Calendar calendarStart = new GregorianCalendar();
//Calendar calendarEnd = new GregorianCalendar();
Date dateToFormat = format.parse(lsrun);
calendarStart.setTime(dateToFormat);
calendarStart.add(Calendar.HOUR, hourValue); 


result = calendarStart.getTime()



