def providedData = dateIn
providedData.format('EEEE, MMM d, yyyy')
def reqDate = providedData + 1
dateOut = reqDate.format("dd/MM/yyyy")