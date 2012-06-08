def dir = new File("d:/tmp7/tomcat-ebmed01/lib/")
dir.eachFile {
    println '''<fileset file="${mainprojectdir}/connect_instaler/target/lib/''' + it.getName() + '''"/>'''
}


//def dir = new File("c:/connect_install8.1/vcs/lib/")
//dir.eachFile {
//    print it.getAbsolutePath() + ";"
//}
