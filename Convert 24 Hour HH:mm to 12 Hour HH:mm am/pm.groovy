
import java.time.LocalTime
import java.time.format.DateTimeFormatter

def inbound2hour = inboundHour

final String time = inbound2hour

String result = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm")).format(DateTimeFormatter.ofPattern("hh:mm a"));

outboundHour = result