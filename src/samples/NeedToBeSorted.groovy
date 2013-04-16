package samples

import org.codehaus.groovy.runtime.ProcessGroovyMethods
import groovy.transform.Field




def process = "hello.bat".execute()
// presmeruje out a err procesu do tohot procesu!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
ProcessGroovyMethods.consumeProcessOutput(process, System.out, System.err)
process.waitFor()





//ANOTACE FIELD!!!! JINAK BY TO NEFUNGOVALO
@Field int viditelnyZMetody
methodName()
private void methodName() {
    println viditelnyZMetody
}