
    import java.text.*
    import java.util.Date;

    DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");

    if (inputdate == inputdate == null || inputdate == "NULL" || inputdate == "null"){
        formatteddate = '';
    } else {
        Date date = originalFormat.parse(inputdate); 
        formatteddate = targetFormat.format(date);
    }
