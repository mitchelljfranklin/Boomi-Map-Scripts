import java.util.Date;
import java.text.SimpleDateFormat;

SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
isoFormat.setTimeZone(TimeZone.getTimeZone("AEST"));
//offset = isoFormat.parse("1938-08-25T14:00:00Z").toString();

SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy");
offset = newFormat.format(isoFormat.parse("1938-08-25T14:00:00Z"));