
/*
    Validate Australia Phone Numbers

    This function will remove any non-numeric characters and validate the 
    format matches an Australian land or mobile number.
    
    Formats accepted:
    
        (07) 3456 8797
        0734568797
        +61734568797
        
        0412 456 789
        0412456789
        +61412456789


*/


// Remove any non-numeric characters
phoneNumber = phoneNumber.replaceAll("[^\\d+]", "");

// Validate phoneNumber matches regex pattern
validNumber = phoneNumber ==~ /(?:\+)?(?:61)?(?:0)?[2|3|4|7|8]\d{8}/
