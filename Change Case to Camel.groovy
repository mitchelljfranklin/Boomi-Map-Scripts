def firstLetter = value_In.substring(0,1)

value_Out = value_In.replaceAll(/^[a-z]/, firstLetter.toUpperCase())