/*
    Format BSB Number

    This function formats an input into required BSB format of nnn-nnn



*/

// Remove all non-numerical values
outBSB = inBSB.replaceAll("[^0-9]", "")

// Apply nnn-nnn mask
outBSB = outBSB.replaceAll("\\b(\\d{3})(\\d{3})", "\$1-\$2") 
