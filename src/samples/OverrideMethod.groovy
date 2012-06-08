package samples


//define own method
String.metaClass.myMethod = {-> println "Zdravím " + delegate}
"Honzu".myMethod()


