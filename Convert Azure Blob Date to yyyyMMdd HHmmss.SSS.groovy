import java.text.*
import java.util.Date;

DateFormat originalFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
DateFormat targetFormat = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
Date date = originalFormat.parse(AzureDate); 
ConvertedDate = targetFormat.format(date);
