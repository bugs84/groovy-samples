package samples

groovy.grape.Grape.grab([group:'org.apache.ivy', module:'ivy', version:'2.0.0-beta1', conf:['default', 'optional']],
     [group:'org.apache.ant', module:'ant', version:'1.7.0'])

//Grab, Funguje ale na classpathe musí být závislost na ivy.jar (d:\programs(x86)\apache-ivy-2.2.0\ivy-2.2.0.jar)
//Guava Import
@Grab(group = 'com.google.guava', module = 'guava', version = 'r05')
import com.google.common.collect.Lists


//@Grapes(@Grab(group='log4j', module='log4j', version='1.2.16'))
//@Grab(group='log4j', module='log4j', version='1.2.16')
//public class TestClassAnnotation {
//    public static void testMethod() {
//        org.apache.log4j.BasicConfigurator.configure()
//        def logger = org.apache.log4j.Logger.getLogger("MyLogger")
//        logger.error("Logger error message");
//        logger.error("Logger info message");
//    }
//}

//TestClassAnnotation.testMethod()



List<String> employeeList = Lists.newArrayList("a", "b", "c");
System.out.println("Guava downloaded from maven repo :) : " + employeeList);

